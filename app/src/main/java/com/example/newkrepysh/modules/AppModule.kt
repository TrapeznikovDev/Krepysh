package com.example.newkrepysh.modules

import android.app.Application
import android.content.Context
import com.example.newkrepysh.di.AppContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {

    @AppContext
    @Provides
    @Singleton
    fun provideContext(): Context {
        return application.applicationContext
    }


}