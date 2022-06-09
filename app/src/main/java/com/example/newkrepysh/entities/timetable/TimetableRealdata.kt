package com.example.newkrepysh.entities.timetable

import com.google.gson.annotations.SerializedName

data class TimetableRealdata(
    @SerializedName("trainings" ) var trainings : Int? = null,
    @SerializedName("days"      ) var days      : Int? = null
)
