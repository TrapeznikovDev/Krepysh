package com.example.example

import com.google.gson.annotations.SerializedName


data class Exercise (

  @SerializedName("id"                  ) var id                : Int?              = null,
  @SerializedName("image_cl"            ) var imageCl           : String?           = null,
  @SerializedName("image_wb"            ) var imageWb           : String?           = null,
  @SerializedName("code"                ) var code              : String?           = null,
  @SerializedName("formula"             ) var formula           : String?           = null,
  @SerializedName("video"               ) var video             : String?           = null,
  @SerializedName("stage_start"         ) var stageStart        : Boolean?          = null,
  @SerializedName("stage_gpp"           ) var stageGpp          : Boolean?          = null,
  @SerializedName("stage_finish"        ) var stageFinish       : Boolean?          = null,
  @SerializedName("stage_test"          ) var stageTest         : Boolean?          = null,
  @SerializedName("stage_base_strength" ) var stageBaseStrength : Boolean?          = null,
  @SerializedName("stage_base_agility"  ) var stageBaseAgility  : Boolean?          = null,
  @SerializedName("stage_base_flex"     ) var stageBaseFlex     : Boolean?          = null,
  @SerializedName("stage_game"          ) var stageGame         : Boolean?          = null,
  @SerializedName("is_mix"              ) var isMix             : Boolean?          = null,
  @SerializedName("min_count"           ) var minCount          : Int?              = null,
  @SerializedName("max_count"           ) var maxCount          : Int?              = null,
  @SerializedName("name"                ) var name              : String?           = null,
  @SerializedName("description"         ) var description       : String?           = null,
  @SerializedName("clear_description"   ) var clearDescription  : String?           = null,
  @SerializedName("errors"              ) var errors            : ArrayList<Errors> = arrayListOf()

)