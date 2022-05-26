package com.example.newkrepysh.modules

import android.app.Activity
import android.content.Context
import com.example.newkrepysh.di.uicomponents.PerActivity
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