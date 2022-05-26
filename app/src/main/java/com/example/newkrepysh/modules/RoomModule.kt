package com.example.newkrepysh.modules

import android.app.Application
import androidx.room.Room.databaseBuilder
import com.example.newkrepysh.local.RoomApp
import dagger.Module
import dagger.Provides
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