package com.example.newkrepysh.ui.dashboard

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newkrepysh.di.retrofit.Api
import com.example.newkrepysh.entities.news.DataForNews
import com.example.newkrepysh.entities.news.DataNews
import com.example.newkrepysh.entities.news.GeneralNewsData
import com.example.newkrepysh.entities.news.News
import com.example.newkrepysh.local.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class DashboardViewModel @Inject constructor(
    contextApp: Context,
    val repository: Repository,
) : ViewModel() {

    val list = MutableLiveData<List<DataForNews>?>()

    suspend fun getDataFromApi(){
        viewModelScope.launch(Dispatchers.IO) {
            val news = repository.api.getNews()
            println(news.body()?.message)
            list.postValue(news.body()?.data?.news?.data)
        }

    }

}