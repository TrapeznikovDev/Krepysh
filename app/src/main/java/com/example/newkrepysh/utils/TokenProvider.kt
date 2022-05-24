package com.example.newkrepysh.utils

import android.content.Context

object TokenProvider {

    fun getToken(context: Context): String{
        return context.getSharedPreferences("AUTH", Context.MODE_PRIVATE).getString("TOKEN", "")?: ""
    }

    fun saveToken(context: Context, string: String){
        context.getSharedPreferences("AUTH", Context.MODE_PRIVATE).edit().putString("TOKEN", string).apply()
    }
}