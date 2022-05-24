package com.example.newkrepysh.entities.news

import com.google.gson.annotations.SerializedName

data class News(
    @SerializedName("id"                ) var id               : Int?              = null,
    @SerializedName("school_id"         ) var schoolId         : Int?              = null,
    @SerializedName("header"            ) var header           : String?           = null,
    @SerializedName("short_description" ) var shortDescription : String?           = null,
    @SerializedName("full_description"  ) var fullDescription  : String?           = null,
    @SerializedName("active"            ) var active           : Int?              = null,
    @SerializedName("created_by"        ) var createdBy        : Int?              = null,
    @SerializedName("updated_by"        ) var updatedBy        : Int?              = null,
    @SerializedName("created_at"        ) var createdAt        : String?           = null,
    @SerializedName("updated_at"        ) var updatedAt        : String?           = null,
    @SerializedName("media"             ) var media            : ArrayList<String> = arrayListOf()
)
