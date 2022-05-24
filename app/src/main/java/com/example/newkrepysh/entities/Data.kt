package com.example.newkrepysh.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Data (

  @SerializedName("token"   ) var token   : String?           = null,
  @SerializedName("schools" ) var schools : ArrayList<String> = arrayListOf(),
  @SerializedName("user"    ) var user    : ArrayList<User>   = arrayListOf(),
  @SerializedName("childs"  ) var childs  : ArrayList<Childs> = arrayListOf()

)