package com.example.newkrepysh.local

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Singleton



@Module
class RoomModule(application: Application) {
    private val db: RoomApp = databaseBuilder(application, RoomApp::class.java, "project-db").fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun providesRoomDatabase(): RoomApp = db

    @Provides
    @Singleton
    fun provideRouteDao(db: RoomApp) = db.dao()
}