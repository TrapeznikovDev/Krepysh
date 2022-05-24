package com.example.newkrepysh.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class User (

  @PrimaryKey @SerializedName("id"                 ) var id               : Int?               = null,
  @SerializedName("type"               ) var type             : String?            = null,
  @SerializedName("email"              ) var email            : String?            = null,
  @SerializedName("phone"              ) var phone            : String?            = null,
  @SerializedName("created_at"         ) var createdAt        : String?            = null,
  @SerializedName("updated_at"         ) var updatedAt        : String?            = null,
  @SerializedName("comment"            ) var comment          : String?            = null,
  @SerializedName("first_name"         ) var firstName        : String?            = null,
  @SerializedName("second_name"        ) var secondName       : String?            = null,
  @SerializedName("third_name"         ) var thirdName        : String?            = null,
  @SerializedName("cash"               ) var cash             : Int?               = null,
  @SerializedName("telegram_chat_id"   ) var telegramChatId   : String?            = null,
  @SerializedName("birthday"           ) var birthday         : String?            = null,
  @SerializedName("active_school"      ) var activeSchool     : Int?               = null,
  @SerializedName("access_card"        ) var accessCard       : String?            = null,
  @SerializedName("sex"                ) var sex              : Int?               = null,
  @SerializedName("tz"                 ) var tz               : String?            = null,
  @SerializedName("points"             ) var points           : Double?            = null,
  @SerializedName("world_rating"       ) var worldRating      : Int?               = null,
  @SerializedName("country_rating"     ) var countryRating    : Int?               = null,
  @SerializedName("region_rating"      ) var regionRating     : Int?               = null,
  @SerializedName("city_rating"        ) var cityRating       : Int?               = null,
  @SerializedName("school_rating"      ) var schoolRating     : Int?               = null,
  @SerializedName("calculated_at"      ) var calculatedAt     : String?            = null,
  @SerializedName("login"              ) var login            : String?            = null,
  @Embedded(prefix = "latest_sale")@SerializedName("latest_sale_action" ) var latestSaleAction : LatestSaleAction?  = LatestSaleAction(),
  @SerializedName("media"              ) var media            : List<Media>   = listOf(),
  @Ignore @SerializedName("schools"            ) var schools          : ArrayList<Schools> = arrayListOf(),
  @Embedded(prefix = "wallet")@SerializedName("wallet"             ) var wallet           : Wallet?            = Wallet()

)