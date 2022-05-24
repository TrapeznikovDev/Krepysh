package com.example.newkrepysh.entities.schoolstaff

import com.google.gson.annotations.SerializedName

data class SchoolStaff(
    @SerializedName("success") var success: Boolean? = null,
    @SerializedName("dataStaff") var data: ArrayList<DataSchoolStaff> = arrayListOf(),
    @SerializedName("message") var message: String? = null
)