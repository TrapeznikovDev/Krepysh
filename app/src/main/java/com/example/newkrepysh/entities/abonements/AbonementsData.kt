package com.example.newkrepysh.entities.abonements

import com.example.example.Group
import com.example.example.Realdata
import com.example.example.Type
import com.google.gson.annotations.SerializedName

data class AbonementsData(

    @SerializedName("id"                ) var id              : Int?      = null,
    @SerializedName("user_id"           ) var userId          : Int?      = null,
    @SerializedName("abonement_type_id" ) var abonementTypeId : Int?      = null,
    @SerializedName("name"              ) var name            : String?   = null,
    @SerializedName("trainings"         ) var trainings       : Int?      = null,
    @SerializedName("days"              ) var days            : Int?      = null,
    @SerializedName("price"             ) var price           : Int?      = null,
    @SerializedName("active"            ) var active          : Int?      = null,
    @SerializedName("deleted_at"        ) var deletedAt       : String?   = null,
    @SerializedName("created_at"        ) var createdAt       : String?   = null,
    @SerializedName("updated_at"        ) var updatedAt       : String?   = null,
    @SerializedName("child_id"          ) var childId         : Int?      = null,
    @SerializedName("group_id"          ) var groupId         : Int?      = null,
    @SerializedName("start_date"        ) var startDate       : String?   = null,
    @SerializedName("created_by"        ) var createdBy       : String?   = null,
    @SerializedName("updated_by"        ) var updatedBy       : String?   = null,
    @SerializedName("status"            ) var status          : Int?      = null,
    @SerializedName("is_trial"          ) var isTrial         : Int?      = null,
    @SerializedName("is_faith"          ) var isFaith         : Int?      = null,
    @SerializedName("expired_at"        ) var expiredAt       : String?   = null,
    @SerializedName("order_id"          ) var orderId         : Int?      = null,
    @SerializedName("paid"              ) var paid            : Int?      = null,
    @SerializedName("realdata"          ) var realdata        : Realdata? = Realdata(),
    @SerializedName("type"              ) var type            : Type?     = Type(),
    @SerializedName("group"             ) var group           : Group?    = Group()
)
