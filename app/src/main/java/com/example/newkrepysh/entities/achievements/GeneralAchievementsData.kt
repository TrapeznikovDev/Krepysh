package com.example.newkrepysh.entities.achievements

import com.google.gson.annotations.SerializedName

data class GeneralAchievementsData (
    @SerializedName("success" ) var success : Boolean? = null,
    @SerializedName("data"    ) var data    : AchievementsData    = AchievementsData(),
    @SerializedName("message" ) var message : String?  = null
)