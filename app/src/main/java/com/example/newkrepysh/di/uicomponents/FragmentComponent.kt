package com.example.newkrepysh.di.uicomponents

import android.content.Context
import com.example.newkrepysh.modules.ViewModelModule
import com.example.newkrepysh.local.Repository
import com.example.newkrepysh.modules.FragmentModule
import com.example.newkrepysh.ui.dashboard.DashboardFragment
import com.example.newkrepysh.ui.home.HomeFragment
import com.example.newkrepysh.ui.notifications.NotificationsFragment
import com.example.newkrepysh.ui.profile.KidsProfileFragment
import com.example.newkrepysh.ui.timetable.TimetableFragment
import dagger.Component

@PerFragment
@Component(dependencies = [ActivityComponent::class], modules = [FragmentModule::class, ViewModelModule::class])
interface FragmentComponent {

    fun context(): Context

    fun repository(): Repository

    fun inject(fragment: DashboardFragment)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: NotificationsFragment)
    fun inject(fragment: KidsProfileFragment)
    fun inject(fragment: TimetableFragment)

}