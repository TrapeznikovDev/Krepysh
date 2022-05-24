package com.example.newkrepysh.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin (

  @SerializedName("success" ) var success : Boolean? = null,
  @SerializedName("data"    ) var data    : Data?    = Data(),
  @SerializedName("message" ) var message : String?  = null

)