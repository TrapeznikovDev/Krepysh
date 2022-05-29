package com.example.newkrepysh.entities.news

import com.google.gson.annotations.SerializedName

data class DataDataNews (
    @SerializedName("news" ) var news : News? = News()
        )