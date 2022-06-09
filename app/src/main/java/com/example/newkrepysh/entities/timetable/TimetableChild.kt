package com.example.newkrepysh.entities.timetable

import com.example.newkrepysh.entities.Parent
import com.example.newkrepysh.entities.User
import com.google.gson.annotations.SerializedName

data class TimetableChild(
    @SerializedName("id"                  ) var id                 : Int?    = null,
    @SerializedName("user_id"             ) var userId             : Int?    = null,
    @SerializedName("parent_id"           ) var parentId           : Int?    = null,
    @SerializedName("level"               ) var level              : Int?    = null,
    @SerializedName("points"              ) var points             : Int?    = null,
    @SerializedName("medical_certificate" ) var medicalCertificate : String? = null,
    @SerializedName("sports_insurance"    ) var sportsInsurance    : String? = null,
    @SerializedName("trial_used"          ) var trialUsed          : Int?    = null,
    @SerializedName("deleted_at"          ) var deletedAt          : String? = null,
    @SerializedName("contract_number"     ) var contractNumber     : String? = null,
    @SerializedName("contract_datetime"   ) var contractDatetime   : String? = null,
    @SerializedName("parent"              ) var parent             : Parent? = Parent(),
    @SerializedName("user"                ) var user               : TimetableUser?   = TimetableUser()
)
