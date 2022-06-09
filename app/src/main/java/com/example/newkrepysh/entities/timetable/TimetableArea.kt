package com.example.newkrepysh.entities.timetable

import com.google.gson.annotations.SerializedName

data class TimetableArea(
    @SerializedName("id"                        ) var id                     : Int?                = null,
    @SerializedName("name"                      ) var name                   : String?             = null,
    @SerializedName("active"                    ) var active                 : Int?                = null,
    @SerializedName("school_id"                 ) var schoolId               : Int?                = null,
    @SerializedName("created_at"                ) var createdAt              : String?             = null,
    @SerializedName("updated_at"                ) var updatedAt              : String?             = null,
    @SerializedName("type"                      ) var type                   : String?             = null,
    @SerializedName("training_area_category_id" ) var trainingAreaCategoryId : Int?                = null,
    @SerializedName("camera"                    ) var camera                 : String?             = null,
    @SerializedName("deleted_at"                ) var deletedAt              : String?             = null,
    @SerializedName("trainers"                  ) var trainers               : ArrayList<TimetableTrainers> = arrayListOf()
)
