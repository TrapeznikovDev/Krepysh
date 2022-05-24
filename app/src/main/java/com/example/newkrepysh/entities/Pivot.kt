package com.example.newkrepysh.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Pivot(

    @PrimaryKey @SerializedName("user_id") var userId: Int? = null,
    @SerializedName("school_id") var schoolId: Int? = null

)