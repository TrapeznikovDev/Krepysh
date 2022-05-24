package com.example.newkrepysh.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Media (

  @SerializedName("id"                    ) var id                   : Int?                  = null,
  @SerializedName("model_type"            ) var modelType            : String?               = null,
  @PrimaryKey@SerializedName("model_id"   ) var modelId              : Int?                  = null,
  @SerializedName("uuid"                  ) var uuid                 : String?               = null,
  @SerializedName("collection_name"       ) var collectionName       : String?               = null,
  @SerializedName("name"                  ) var name                 : String?               = null,
  @SerializedName("file_name"             ) var fileName             : String?               = null,
  @SerializedName("mime_type"             ) var mimeType             : String?               = null,
  @SerializedName("disk"                  ) var disk                 : String?               = null,
  @SerializedName("conversions_disk"      ) var conversionsDisk      : String?               = null,
  @SerializedName("size"                  ) var size                 : Int?                  = null,
  @SerializedName("manipulations"         ) var manipulations        : ArrayList<String>     = arrayListOf(),
  @Ignore@SerializedName("custom_properties"     ) var customProperties     : CustomProperties?     = CustomProperties(),
  @SerializedName("responsive_images"     ) var responsiveImages     : ArrayList<String>     = arrayListOf(),
  @SerializedName("order_column"          ) var orderColumn          : Int?                  = null,
  @Ignore@SerializedName("generated_conversions" ) var generatedConversions : GeneratedConversions? = GeneratedConversions(),
  @Embedded@SerializedName("url"                   ) var url                  : Url?                  = Url()

)