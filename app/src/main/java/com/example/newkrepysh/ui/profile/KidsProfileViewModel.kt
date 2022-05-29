package com.example.newkrepysh.ui.profile

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.newkrepysh.local.Repository
import javax.inject.Inject

class KidsProfileViewModel @Inject constructor(
    contextApp: Context,
    val repository: Repository
)  : ViewModel(){

}