package com.example.newkrepysh.entities.parent

import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.User
import com.google.gson.annotations.SerializedName

data class ParentData (@SerializedName("user") val user: List<User> = listOf(),
                                 @SerializedName("childs") val childs:List<Childs> = listOf())
