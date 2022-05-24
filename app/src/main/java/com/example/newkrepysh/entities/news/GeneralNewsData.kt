package com.example.newkrepysh.entities.news

data class GeneralNewsData(var success: Boolean? = null, var data: List<DataNews> = listOf(), var message: String? = null)
