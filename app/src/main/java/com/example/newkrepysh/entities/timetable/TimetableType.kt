package com.example.newkrepysh.entities.timetable

import com.google.gson.annotations.SerializedName

data class TimetableType(
    @SerializedName("id"         ) var id        : Int?    = null,
    @SerializedName("school_id"  ) var schoolId  : Int?    = null,
    @SerializedName("name"       ) var name      : String? = null,
    @SerializedName("trainings"  ) var trainings : Int?    = null,
    @SerializedName("days"       ) var days      : Int?    = null,
    @SerializedName("price"      ) var price     : String? = null,
    @SerializedName("active"     ) var active    : Int?    = null,
    @SerializedName("deleted_at" ) var deletedAt : String? = null,
    @SerializedName("group_id"   ) var groupId   : Int?    = null,
    @SerializedName("uid"        ) var uid       : String? = null,
    @SerializedName("is_trial"   ) var isTrial   : Int?    = null,
    @SerializedName("months"     ) var months    : Int?    = null
)
