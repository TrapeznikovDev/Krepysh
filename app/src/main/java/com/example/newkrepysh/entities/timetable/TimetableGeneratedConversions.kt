package com.example.newkrepysh.entities.timetable

import com.google.gson.annotations.SerializedName

data class TimetableGeneratedConversions(
    @SerializedName("top_thumb"     ) var topThumb     : Boolean? = null,
    @SerializedName("full_image"    ) var fullImage    : Boolean? = null,
    @SerializedName("crm_top_thumb" ) var crmTopThumb  : Boolean? = null,
    @SerializedName("profile_thumb" ) var profileThumb : Boolean? = null
)
