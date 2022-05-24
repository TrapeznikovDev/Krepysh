package com.example.example

import com.google.gson.annotations.SerializedName


data class Langed (

  @SerializedName("name"        ) var name        : String? = null,
  @SerializedName("description" ) var description : String? = null

)