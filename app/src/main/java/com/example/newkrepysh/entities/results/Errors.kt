package com.example.example

import com.google.gson.annotations.SerializedName


data class Errors (

  @SerializedName("id"          ) var id          : Int?    = null,
  @SerializedName("code"        ) var code        : String? = null,
  @SerializedName("coefficiens" ) var coefficiens : Double? = null,
  @SerializedName("exercise_id" ) var exerciseId  : Int?    = null,
  @SerializedName("active"      ) var active      : Int?    = null,
  @SerializedName("deleted_at"  ) var deletedAt   : String? = null,
  @SerializedName("created_at"  ) var createdAt   : String? = null,
  @SerializedName("updated_at"  ) var updatedAt   : String? = null,
  @SerializedName("name"        ) var name        : String? = null,
  @SerializedName("description" ) var description : String? = null

)