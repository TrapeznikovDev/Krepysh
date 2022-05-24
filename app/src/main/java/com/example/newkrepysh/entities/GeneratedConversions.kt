package com.example.newkrepysh.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class GeneratedConversions (

  @PrimaryKey var id: Int? = 0,
  @SerializedName("top_thumb"     ) var topThumb     : Boolean? = null,
  @SerializedName("full_image"    ) var fullImage    : Boolean? = null,
  @SerializedName("crm_top_thumb" ) var crmTopThumb  : Boolean? = null,
  @SerializedName("profile_thumb" ) var profileThumb : Boolean? = null

)