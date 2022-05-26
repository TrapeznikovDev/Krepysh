package com.example.newkrepysh.modules

import com.example.newkrepysh.di.retrofit.Api
import com.example.newkrepysh.local.Repository
import com.example.newkrepysh.local.RoomApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {



    @Provides
    @Singleton
    fun provideRepository(db: RoomApp, api: Api) = Repository(db, api)

}