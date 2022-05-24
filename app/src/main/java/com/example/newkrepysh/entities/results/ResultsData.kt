package com.example.newkrepysh.entities.results

import com.google.gson.annotations.SerializedName

data class ResultsData(

    @SerializedName("krepyshtests" ) var krepyshtests : ArrayList<Krepyshtests> = arrayListOf(),
    @SerializedName("achievements" ) var achievements : ArrayList<String>       = arrayListOf()
)
