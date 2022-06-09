package com.example.newkrepysh.entities.timetable

import com.google.gson.annotations.SerializedName

data class TimetableData(
    @SerializedName("trainings" ) var trainings : ArrayList<TimetableTrainings> = arrayListOf()
)
