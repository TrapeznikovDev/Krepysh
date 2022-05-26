package com.example.newkrepysh.local

import android.content.Context
import com.example.newkrepysh.di.retrofit.Api
import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.User
import com.example.newkrepysh.entities.auth.AuthBody
import com.example.newkrepysh.utils.TokenProvider
import javax.inject.Inject


class Repository  @Inject constructor(val db: RoomApp, val api: Api){

    var parent: User?= null

    suspend fun putUserToDb(){
        val response = api.getUser()
        if(response.isSuccessful){
            response.body()?.let { it.parent.user.forEach { user-> db.dao().insertUser(user) }
            parent = it.parent.user.firstOrNull()
            }
            response.body()?.let { it.parent.childs.forEach { child->
                db.dao().insertChild(child) } }

        }
//        it.user?.media?.forEach { db.dao().insertMedia(it) }
    }
    fun getKidsFromDb(): List<Childs>{
        return db.dao().getChild()
    }

    fun getUserFromDB(id: Int): User {

        return db.dao().getUser(id)
    }


    suspend fun auth(body: AuthBody, context: Context): ErrorHandler{
        val resp = api.auth(body)
        if (resp.code()==200){
            if (resp.body()?.success == true){
                TokenProvider.saveToken(context, resp.body()?.data?.token ?: "")
                resp.body()?.data?.childs?.forEach {
                    db.dao().insertChild(it)
                }
                putUserToDb()
            }
            else{
                return ErrorHandler.authError
            }
        } else{
            return ErrorHandler.serverError
        }
        return ErrorHandler.success
    }
}

enum class ErrorHandler{
    success, authError, serverError, initial
}