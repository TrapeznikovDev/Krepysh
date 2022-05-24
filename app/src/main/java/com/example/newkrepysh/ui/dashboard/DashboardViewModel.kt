package com.example.newkrepysh.ui.dashboard

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newkrepysh.local.Repository
import javax.inject.Inject

class DashboardViewModel @Inject constructor(
    contextApp: Context,
    val repository: Repository,
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}