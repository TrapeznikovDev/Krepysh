package com.example.newkrepysh.entities.timetable

data class StatusLogs(
    var timezone: String,
    var status_now: Int,
    var status_was: Int,
    var updated_at: String,
    var updated_by: Int,

)
