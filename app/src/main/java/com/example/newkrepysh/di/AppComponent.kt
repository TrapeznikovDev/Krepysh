package com.example.newkrepysh.di

import android.content.Context
import com.example.newkrepysh.MainApplication
import com.example.newkrepysh.modules.ViewModelModule
import com.example.newkrepysh.modules.RepositoryModule
import com.example.newkrepysh.di.retrofit.Api
import com.example.newkrepysh.modules.RetrofitModule
import com.example.newkrepysh.local.Repository
import com.example.newkrepysh.local.RoomApp
import com.example.newkrepysh.modules.AppModule
import com.example.newkrepysh.modules.RoomModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RoomModule::class, RepositoryModule::class, RetrofitModule::class, ViewModelModule::class])
interface AppComponent {

    @AppContext
    fun context(): Context

    fun repository(): Repository

    fun db(): RoomApp

    fun api(): Api

    fun inject(reciever: MainApplication)

}