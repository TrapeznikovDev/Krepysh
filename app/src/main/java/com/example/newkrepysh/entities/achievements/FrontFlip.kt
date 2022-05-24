package com.example.example

import com.google.gson.annotations.SerializedName


data class FrontFlip (

  @SerializedName("name"        ) var name        : String?           = null,
  @SerializedName("description" ) var description : String?           = null,
  @SerializedName("access"      ) var access      : ArrayList<String> = arrayListOf(),
  @SerializedName("points"      ) var points      : Int?              = null,
  @SerializedName("image"       ) var image       : String?           = null,
  @SerializedName("video"       ) var video       : String?           = null,
  @SerializedName("langed"      ) var langed      : Langed?           = Langed(),
  @SerializedName("id"          ) var id          : String?           = null,
  @SerializedName("secret"      ) var secret      : Boolean?          = null,
  @SerializedName("unlocked"    ) var unlocked    : Boolean?          = null,
  @SerializedName("unlocked_at" ) var unlockedAt  : String?           = null

)