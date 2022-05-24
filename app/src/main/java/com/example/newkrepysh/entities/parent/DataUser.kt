package com.example.newkrepysh.entities.parent

import com.google.gson.annotations.SerializedName

data class DataUser(@SerializedName("data")var parent: ParentData, var message: String, var success: Boolean)
