package com.example.newkrepysh.entities.timetable

import com.google.gson.annotations.SerializedName

data class TimeTableExampleJson2KtKotlin(
    @SerializedName("success" ) var success : Boolean? = null,
    @SerializedName("data"    ) var data    : TimetableData?    = TimetableData(),
    @SerializedName("message" ) var message : String?  = null
)
