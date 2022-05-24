package com.example.newkrepysh.entities.results

import com.example.example.Body
import com.example.example.Tests
import com.google.gson.annotations.SerializedName


data class Krepyshtests(
    @SerializedName("date"  ) var date  : String?          = null,
    @SerializedName("body"  ) var body  : ArrayList<Body>  = arrayListOf(),
    @SerializedName("tests" ) var tests : ArrayList<Tests> = arrayListOf()
)
