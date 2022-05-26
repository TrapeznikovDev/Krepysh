package com.example.newkrepysh

import android.app.Application
import com.example.newkrepysh.di.AppComponent

class MainApplication: Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
       ComponentManager.instance.init(this)
    }

}