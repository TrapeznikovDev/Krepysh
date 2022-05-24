package com.example.newkrepysh.entities.abonements

import com.google.gson.annotations.SerializedName


data class Schedules (

  @SerializedName("id"               ) var id             : Int?    = null,
  @SerializedName("school_id"        ) var schoolId       : Int?    = null,
  @SerializedName("group_id"         ) var groupId        : Int?    = null,
  @SerializedName("start"            ) var start          : String? = null,
  @SerializedName("end"              ) var end            : String? = null,
  @SerializedName("day"              ) var day            : Int?    = null,
  @SerializedName("created_at"       ) var createdAt      : String? = null,
  @SerializedName("updated_at"       ) var updatedAt      : String? = null,
  @SerializedName("deleted_at"       ) var deletedAt      : String? = null,
  @SerializedName("active"           ) var active         : Int?    = null,
  @SerializedName("training_area_id" ) var trainingAreaId : Int?    = null

)