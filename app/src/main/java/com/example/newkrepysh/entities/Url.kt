package com.example.newkrepysh.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Url (
  @PrimaryKey var idd:Int = 0,
  @SerializedName("crm_top_thumb" ) var crmTopThumb  : String? = null,
  @SerializedName("top_thumb"     ) var topThumb     : String? = null,
  @SerializedName("profile_thumb" ) var profileThumb : String? = null,
  @SerializedName("full_image"    ) var fullImage    : String? = null

)