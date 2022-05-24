package com.example.example

import com.google.gson.annotations.SerializedName


data class Realdata (

  @SerializedName("trainings" ) var trainings : Int? = null,
  @SerializedName("days"      ) var days      : Int? = null

)