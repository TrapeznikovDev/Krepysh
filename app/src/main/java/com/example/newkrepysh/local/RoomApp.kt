package com.example.newkrepysh.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newkrepysh.entities.*
import com.example.newkrepysh.local.dao.Dao


@Database(entities = [Childs::class, Areas::class, GeneratedConversions::class, LatestSaleAction::class, Media::class, Parent::class, Pivot::class, Schools::class, Url::class, User::class, Wallet::class],
    version = 4, exportSchema = false)
@TypeConverters(Converter::class)
abstract class RoomApp: RoomDatabase() {

    abstract fun dao(): Dao

    companion object{
        private var instance: RoomApp? = null

        fun getInstance(context: Context): RoomApp?{
            if(instance == null){
                synchronized(RoomApp::class){
                    instance = Room.databaseBuilder(
                        context,RoomApp::class.java,"a"
                    ).allowMainThreadQueries().build()
                }
            }
            return instance
        }
    }


}