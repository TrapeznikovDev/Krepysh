package com.example.newkrepysh

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.example.newkrepysh.di.AppComponent
import com.example.newkrepysh.di.AppModule
import com.example.newkrepysh.di.DaggerAppComponent
import com.example.newkrepysh.di.retrofit.RetrofitModule
import com.example.newkrepysh.di.uicomponents.*
import com.example.newkrepysh.local.RoomModule

class ComponentManager {

    lateinit var appComponent: AppComponent

    private val activityComponentMap = HashMap<String, ActivityComponent>()
    private val fragmentComponentMap = HashMap<String, FragmentComponent>()

    fun init(application: Application){
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(application))
            .roomModule(RoomModule(application))
            .retrofitModule(RetrofitModule(application.applicationContext))
            .build()

        appComponent.inject(application as MainApplication)
    }

    fun getActivityComponent(activity: Activity): ActivityComponent{
        val key = getKey(activity)
        val activityComponent: ActivityComponent?
        activityComponent = createNewActivityComponent(activity)
        activityComponentMap[key] = activityComponent
        return activityComponent
    }

    fun removeActivityComponent(activity: Activity){
        activityComponentMap.remove(getKey(activity))
    }

    private fun createNewActivityComponent(activity: Activity): ActivityComponent{
        return DaggerActivityComponent.builder()
            .appComponent(appComponent)
            .activityModule(ActivityModule(activity))
            .build()
    }

    fun getFragmentComponent(fragment: Fragment): FragmentComponent{
        val activity = fragment.requireActivity()
        val args = fragment.arguments
        val key_suffix = if (args != null) "" + args.hashCode() else ""
        val key = getKey(activity) + key_suffix
        val activityComponent = getActivityComponent(activity)

        val fragmentComponent = DaggerFragmentComponent.builder()
            .activityComponent(activityComponent)
            .fragmentModule(FragmentModule())
            .build()

        fragmentComponentMap[key] = fragmentComponent

        return fragmentComponent
    }

    private fun getKey(activity: Activity): String {
        return activity.localClassName
    }

    private object Holder {
        val INSTANCE = ComponentManager()
    }

    companion object{
        val instance: ComponentManager by lazy { Holder.INSTANCE }
    }
}