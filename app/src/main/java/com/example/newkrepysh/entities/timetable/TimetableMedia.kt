package com.example.newkrepysh.entities.timetable

import com.example.newkrepysh.entities.CustomProperties
import com.example.newkrepysh.entities.GeneratedConversions
import com.example.newkrepysh.entities.Url
import com.google.gson.annotations.SerializedName

data class TimetableMedia(
    @SerializedName("id"                    ) var id                   : Int?                  = null,
    @SerializedName("model_type"            ) var modelType            : String?               = null,
    @SerializedName("model_id"              ) var modelId              : Int?                  = null,
    @SerializedName("uuid"                  ) var uuid                 : String?               = null,
    @SerializedName("collection_name"       ) var collectionName       : String?               = null,
    @SerializedName("name"                  ) var name                 : String?               = null,
    @SerializedName("file_name"             ) var fileName             : String?               = null,
    @SerializedName("mime_type"             ) var mimeType             : String?               = null,
    @SerializedName("disk"                  ) var disk                 : String?               = null,
    @SerializedName("conversions_disk"      ) var conversionsDisk      : String?               = null,
    @SerializedName("size"                  ) var size                 : Int?                  = null,
    @SerializedName("manipulations"         ) var manipulations        : ArrayList<String>     = arrayListOf(),
    @SerializedName("custom_properties"     ) var customProperties     : Any?     = Any(),
    @SerializedName("responsive_images"     ) var responsiveImages     : ArrayList<String>     = arrayListOf(),
    @SerializedName("order_column"          ) var orderColumn          : Int?                  = null,
    @SerializedName("generated_conversions" ) var generatedConversions : TimetableGeneratedConversions? = TimetableGeneratedConversions(),
    @SerializedName("url"                   ) var url                  : Url?                  = Url()
)
