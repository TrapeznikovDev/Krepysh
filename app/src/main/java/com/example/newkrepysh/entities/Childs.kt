package com.example.newkrepysh.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.newkrepysh.entities.abonements.AbonementsData
import com.google.gson.annotations.SerializedName

@Entity
data class Childs(

    @PrimaryKey @SerializedName("id") var id: Int? = null,
    @SerializedName("user_id") var userId: Int? = null,
    @SerializedName("parent_id") var parentId: Int? = null,
    @SerializedName("level") var level: Int? = null,
    @SerializedName("points") var points: Int? = null,
    @SerializedName("medical_certificate") var medicalCertificate: String? = null,
    @SerializedName("sports_insurance") var sportsInsurance: String? = null,
    @SerializedName("trial_used") var trialUsed: Int? = null,
    @SerializedName("deleted_at") var deletedAt: String? = null,
    @SerializedName("contract_number") var contractNumber: String? = null,
    @SerializedName("contract_datetime") var contractDatetime: String? = null,
    @Embedded(prefix = "parents") @SerializedName("parent") var parent: Parent? = Parent(),
    @Embedded(prefix = "users") @SerializedName("user") var user: User? = User(),
    @SerializedName("abonements") var abonements: List<AbonementsData> = listOf()

)