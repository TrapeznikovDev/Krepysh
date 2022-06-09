package com.example.newkrepysh.entities.timetable

import com.google.gson.annotations.SerializedName

data class TimetableCustomProperties(
    @SerializedName("generated_conversions" ) var generatedConversions : TimetableGeneratedConversions? = TimetableGeneratedConversions()
)
