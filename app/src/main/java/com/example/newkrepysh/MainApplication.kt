package com.example.newkrepysh

import android.app.Application
import com.example.newkrepysh.di.AppComponent
import com.example.newkrepysh.di.AppModule
import com.example.newkrepysh.di.DaggerAppComponent
import com.example.newkrepysh.di.repository.RepositoryModule
import com.example.newkrepysh.di.retrofit.RetrofitModule
import com.example.newkrepysh.local.RoomModule

class MainApplication: Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
       ComponentManager.instance.init(this)
    }

}