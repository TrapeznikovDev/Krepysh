package com.example.newkrepysh.entities.timetable

import android.hardware.Camera
import com.google.gson.annotations.SerializedName

data class TimetableTrainings(
    @SerializedName("id"               ) var id             : Int?              = null,
    @SerializedName("schedule_id"      ) var scheduleId     : Int?              = null,
    @SerializedName("trainer_id"       ) var trainerId      : String?           = null,
    @SerializedName("group_id"         ) var groupId        : Int?              = null,
    @SerializedName("training_area_id" ) var trainingAreaId : Int?              = null,
    @SerializedName("start"            ) var start          : String?           = null,
    @SerializedName("end"              ) var end            : String?           = null,
    @SerializedName("status"           ) var status         : Int?              = null,
    @SerializedName("deleted_at"       ) var deletedAt      : String?           = null,
    @SerializedName("created_at"       ) var createdAt      : String?           = null,
    @SerializedName("updated_at"       ) var updatedAt      : String?           = null,
    @SerializedName("paid"             ) var paid           : Int?              = null,
    @SerializedName("is_krepyshtest"   ) var isKrepyshtest  : Int?              = null,
    @SerializedName("tz"               ) var tz             : String?           = null,
    @SerializedName("school_id"        ) var schoolId       : Int?              = null,
    @SerializedName("trainers"         ) var trainers       : ArrayList<TimetableTrainers> = arrayListOf(),
    @SerializedName("status_logs"      ) var statusLogs     : ArrayList<StatusLogs>?       = arrayListOf(),
    @SerializedName("trainer"          ) var trainer        : String?           = null,
    @SerializedName("area"             ) var area           : TimetableArea?             = TimetableArea(),
    @SerializedName("group"            ) var group          : TimetableGroup?            = TimetableGroup()
)
