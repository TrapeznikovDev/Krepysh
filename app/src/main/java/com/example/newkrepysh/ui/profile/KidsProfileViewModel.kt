package com.example.newkrepysh.ui.profile

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
import javax.inject.Inject

class KidsProfileViewModel @Inject constructor(
    contextApp: Context,
    val repository: Repository
)  : ViewModel(){

    var kid = MutableLiveData<Childs>()
    var list: LiveData<Childs> = kid

    fun initKids(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {

            val kids = repository.getChildBuId(id)
            kid.postValue(kids)
        }
    }
}