package com.example.newkrepysh.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Wallet (

  @PrimaryKey @SerializedName("id"          ) var id         : Int?    = null,
  @SerializedName("user_id"     ) var userId     : Int?    = null,
  @SerializedName("imcoin"      ) var imcoin     : Int?    = null,
  @SerializedName("ruble"       ) var ruble      : Int?    = null,
  @SerializedName("working_off" ) var workingOff : Int?    = null,
  @SerializedName("created_at"  ) var createdAt  : String? = null,
  @SerializedName("updated_at"  ) var updatedAt  : String? = null,
  @SerializedName("personal"    ) var personal   : Int?    = null,
  @SerializedName("one_time"    ) var oneTime    : Int?    = null

)