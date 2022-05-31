package com.example.newkrepysh.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.User
import com.example.newkrepysh.local.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    contextApp: Context,
    val repository: Repository,
) : ViewModel() {

    var parent = MutableLiveData<User?>()


    private var _list = MutableLiveData<List<Childs?>>()
    var list: LiveData<List<Childs?>> = _list

    suspend fun getUserFromApi() {
        repository.putUserToDb()
    }

    fun initUser() {
        viewModelScope.launch(Dispatchers.IO) {
            getUserFromApi()
            val kids = repository.getKidsFromDb()

            _list.postValue(kids)
            parent.postValue(repository.parent)
            withContext(Dispatchers.Main){

            }

        }
    }

}