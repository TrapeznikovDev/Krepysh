package com.example.newkrepysh.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class CustomProperties (

  @Ignore @SerializedName("generated_conversions" ) var generatedConversions : GeneratedConversions? = GeneratedConversions()

)