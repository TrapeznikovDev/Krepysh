package com.example.newkrepysh.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class LatestSaleAction (

  @PrimaryKey@SerializedName("id"         ) var id        : Int?    = null,
  @SerializedName("object_id"  ) var objectId  : Int?    = null,
  @SerializedName("action"     ) var action    : String? = null,
  @SerializedName("school_id"  ) var schoolId  : Int?    = null,
  @SerializedName("created_at" ) var createdAt : String? = null,
  @SerializedName("updated_at" ) var updatedAt : String? = null,
  @SerializedName("deleted_at" ) var deletedAt : String? = null

)