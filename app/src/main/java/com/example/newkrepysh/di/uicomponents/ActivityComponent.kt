package com.example.newkrepysh.di.uicomponents

import android.content.Context
import com.example.newkrepysh.ui.main.MainActivity
import com.example.newkrepysh.modules.ViewModelModule
import com.example.newkrepysh.activities.AuthActivity
import com.example.newkrepysh.di.AppComponent
import com.example.newkrepysh.local.Repository
import com.example.newkrepysh.modules.ActivityModule
import dagger.Component

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class, ViewModelModule::class])
interface ActivityComponent {

    fun context(): Context

    fun repository(): Repository
    fun inject(activity: MainActivity)
    fun inject(activity: AuthActivity)
}