package com.example.example

import com.example.newkrepysh.entities.Schools
import com.example.newkrepysh.entities.abonements.Schedules
import com.google.gson.annotations.SerializedName


data class Group (

  @SerializedName("id"                        ) var id                     : Int?                 = null,
  @SerializedName("name"                      ) var name                   : String?              = null,
  @SerializedName("full_name"                 ) var fullName               : String?              = null,
  @SerializedName("description"               ) var description            : String?              = null,
  @SerializedName("count"                     ) var count                  : Int?                 = null,
  @SerializedName("max"                       ) var max                    : Int?                 = null,
  @SerializedName("active"                    ) var active                 : Int?                 = null,
  @SerializedName("created_at"                ) var createdAt              : String?              = null,
  @SerializedName("updated_at"                ) var updatedAt              : String?              = null,
  @SerializedName("deleted_at"                ) var deletedAt              : String?              = null,
  @SerializedName("school_id"                 ) var schoolId               : Int?                 = null,
  @SerializedName("group_category"            ) var groupCategory          : String?              = null,
  @SerializedName("complex"                   ) var complex                : String?              = null,
  @SerializedName("level"                     ) var level                  : String?              = null,
  @SerializedName("lifetime"                  ) var lifetime               : String?              = null,
  @SerializedName("lifetime_minutes"          ) var lifetimeMinutes        : String?              = null,
  @SerializedName("complex_type"              ) var complexType            : String?              = null,
  @SerializedName("training_area_category_id" ) var trainingAreaCategoryId : Int?                 = null,
  @SerializedName("methodology"               ) var methodology            : Methodology?         = Methodology(),
  @SerializedName("school"                    ) var school                 : Schools?              = Schools(),
  @SerializedName("schedules"                 ) var schedules              : ArrayList<Schedules> = arrayListOf()

)