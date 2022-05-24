package com.example.newkrepysh.entities.results

import com.google.gson.annotations.SerializedName

data class GeneralResultsData(

    @SerializedName("success" ) var success : Boolean? = null,
    @SerializedName("data"    ) var data    : ResultsData?    = ResultsData(),
    @SerializedName("message" ) var message : String?  = null
)
