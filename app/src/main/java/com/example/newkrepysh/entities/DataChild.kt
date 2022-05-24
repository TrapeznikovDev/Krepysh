package com.example.newkrepysh.entities

import com.google.gson.annotations.SerializedName

data class DataChild(

    @SerializedName("child") var child: Childs? = Childs(),
    @SerializedName("spectators") var spectators: ArrayList<Spectators> = arrayListOf()

)