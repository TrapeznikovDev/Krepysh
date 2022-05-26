package com.example.newkrepysh.modules

import com.example.newkrepysh.di.uicomponents.PerFragment
import com.example.newkrepysh.ui.dashboard.DashboardFragment
import com.example.newkrepysh.ui.home.HomeFragment
import com.example.newkrepysh.ui.notifications.NotificationsFragment
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    @PerFragment
    fun homeFragment() = HomeFragment()

    @Provides
    @PerFragment
    fun dashboardFragment() = DashboardFragment()

    @Provides
    @PerFragment
    fun notificationsFragment() = NotificationsFragment()



}