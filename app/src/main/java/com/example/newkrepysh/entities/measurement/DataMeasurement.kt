package com.example.newkrepysh.entities.measurement

import com.google.gson.annotations.SerializedName

data class DataMeasurement(
    @SerializedName("id"                   ) var id                 : Int?    = null,
    @SerializedName("child_id"             ) var childId            : Int?    = null,
    @SerializedName("date"                 ) var date               : String? = null,
    @SerializedName("height"               ) var height             : Int?    = null,
    @SerializedName("weight"               ) var weight             : Double? = null,
    @SerializedName("bmi"                  ) var bmi                : Double? = null,
    @SerializedName("neck"                 ) var neck               : Int?    = null,
    @SerializedName("shoulders"            ) var shoulders          : Int?    = null,
    @SerializedName("chest_girth"          ) var chestGirth         : Int?    = null,
    @SerializedName("right_hand_biceps"    ) var rightHandBiceps    : Int?    = null,
    @SerializedName("left_hand_biceps"     ) var leftHandBiceps     : Int?    = null,
    @SerializedName("waist"                ) var waist              : Int?    = null,
    @SerializedName("hips"                 ) var hips               : Int?    = null,
    @SerializedName("right_hip_biceps"     ) var rightHipBiceps     : Int?    = null,
    @SerializedName("left_hip_biceps"      ) var leftHipBiceps      : Int?    = null,
    @SerializedName("right_calf"           ) var rightCalf          : Int?    = null,
    @SerializedName("left_calf"            ) var leftCalf           : Int?    = null,
    @SerializedName("fist_clenching_force" ) var fistClenchingForce : Double? = null,
    @SerializedName("deleted_at"           ) var deletedAt          : String? = null,
    @SerializedName("created_at"           ) var createdAt          : String? = null,
    @SerializedName("updated_at"           ) var updatedAt          : String? = null
)
