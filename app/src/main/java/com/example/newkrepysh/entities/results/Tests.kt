package com.example.example

import com.google.gson.annotations.SerializedName


data class Tests (

  @SerializedName("id"          ) var id         : Int?              = null,
  @SerializedName("exercise_id" ) var exerciseId : Int?              = null,
  @SerializedName("child_id"    ) var childId    : Int?              = null,
  @SerializedName("test_date"   ) var testDate   : String?           = null,
  @SerializedName("repetition"  ) var repetition : Int?              = null,
  @SerializedName("formule"     ) var formule    : String?           = null,
  @SerializedName("result"      ) var result     : Int?              = null,
  @SerializedName("comment"     ) var comment    : String?           = null,
  @SerializedName("deleted_at"  ) var deletedAt  : String?           = null,
  @SerializedName("created_at"  ) var createdAt  : String?           = null,
  @SerializedName("updated_at"  ) var updatedAt  : String?           = null,
  @SerializedName("errors"      ) var errors     : ArrayList<String> = arrayListOf(),
  @SerializedName("exercise"    ) var exercise   : Exercise?         = Exercise()

)