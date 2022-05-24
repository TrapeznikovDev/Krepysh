package com.example.example

import com.google.gson.annotations.SerializedName


data class Methodology (

  @SerializedName("id"                                  ) var id                              : Int?    = null,
  @SerializedName("stage_start_blocksmap_id"            ) var stageStartBlocksmapId           : Int?    = null,
  @SerializedName("stage_start_blocksmap_index"         ) var stageStartBlocksmapIndex        : Int?    = null,
  @SerializedName("stage_base_strength_blocksmap_id"    ) var stageBaseStrengthBlocksmapId    : Int?    = null,
  @SerializedName("stage_base_strength_blocksmap_index" ) var stageBaseStrengthBlocksmapIndex : Int?    = null,
  @SerializedName("stage_base_agility_blocksmap_id"     ) var stageBaseAgilityBlocksmapId     : Int?    = null,
  @SerializedName("stage_base_agility_blocksmap_index"  ) var stageBaseAgilityBlocksmapIndex  : Int?    = null,
  @SerializedName("stage_base_flex_blocksmap_id"        ) var stageBaseFlexBlocksmapId        : Int?    = null,
  @SerializedName("stage_base_flex_blocksmap_index"     ) var stageBaseFlexBlocksmapIndex     : Int?    = null,
  @SerializedName("stage_game_blocksmap_id"             ) var stageGameBlocksmapId            : Int?    = null,
  @SerializedName("stage_game_blocksmap_index"          ) var stageGameBlocksmapIndex         : Int?    = null,
  @SerializedName("stage_gpp_blocksmap_id"              ) var stageGppBlocksmapId             : Int?    = null,
  @SerializedName("stage_gpp_blocksmap_index"           ) var stageGppBlocksmapIndex          : Int?    = null,
  @SerializedName("stage_finish_blocksmap_id"           ) var stageFinishBlocksmapId          : Int?    = null,
  @SerializedName("stage_finish_blocksmap_index"        ) var stageFinishBlocksmapIndex       : Int?    = null,
  @SerializedName("stage_test_blocksmap_id"             ) var stageTestBlocksmapId            : Int?    = null,
  @SerializedName("stage_test_blocksmap_index"          ) var stageTestBlocksmapIndex         : Int?    = null,
  @SerializedName("active"                              ) var active                          : Int?    = null,
  @SerializedName("group_id"                            ) var groupId                         : Int?    = null,
  @SerializedName("deleted_at"                          ) var deletedAt                       : String? = null,
  @SerializedName("created_at"                          ) var createdAt                       : String? = null,
  @SerializedName("updated_at"                          ) var updatedAt                       : String? = null

)