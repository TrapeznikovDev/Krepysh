package com.example.newkrepysh.entities.auth

import com.google.gson.annotations.SerializedName

data class AuthBody(@SerializedName("password")var password: String = "",
                    @SerializedName("phone")var phone: String = "")
