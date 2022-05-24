package com.example.newkrepysh.activities

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newkrepysh.entities.auth.AuthBody
import com.example.newkrepysh.local.ErrorHandler
import com.example.newkrepysh.local.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.PasswordAuthentication
import javax.inject.Inject

class AuthActivityViewModel @Inject constructor(
    contextApp: Context,
    val repository: Repository,
) : ViewModel() {
    var liveDataAuth = MutableLiveData<ErrorHandler>()

     fun auth(password: String, phone: String, context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            liveDataAuth.postValue(repository.auth(AuthBody(password, phone), context))
        }
    }
}