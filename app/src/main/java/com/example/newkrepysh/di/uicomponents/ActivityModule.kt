package com.example.newkrepysh.di.uicomponents

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @PerActivity
    internal fun provideContext(): Context{
        return activity
    }
}