package com.example.newkrepysh.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Schools (

  @PrimaryKey @SerializedName("id"            ) var id           : Int?             = null,
  @SerializedName("active"        ) var active       : Int?             = null,
  @SerializedName("user_owner"    ) var userOwner    : Int?             = null,
  @SerializedName("type"          ) var type         : Int?             = null,
  @SerializedName("name"          ) var name         : String?          = null,
  @SerializedName("created_at"    ) var createdAt    : String?          = null,
  @SerializedName("updated_at"    ) var updatedAt    : String?          = null,
  @SerializedName("deleted_at"    ) var deletedAt    : String?          = null,
  @SerializedName("address"       ) var address      : String?          = null,
  @SerializedName("contact_phone" ) var contactPhone : String?          = null,
  @SerializedName("contact_email" ) var contactEmail : String?          = null,
  @SerializedName("code"          ) var code         : String?          = null,
  @SerializedName("tz"            ) var tz           : String?          = null,
  @SerializedName("city_code"     ) var cityCode     : String?          = null,
  @SerializedName("lat"           ) var lat          : String?          = null,
  @SerializedName("lng"           ) var lng          : String?          = null,
  @Embedded@SerializedName("pivot"         ) var pivot        : Pivot?           = Pivot(),
  @SerializedName("areas"         ) var areas        : ArrayList<Areas> = arrayListOf()

)