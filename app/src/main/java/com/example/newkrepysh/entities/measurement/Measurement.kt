package com.example.newkrepysh.entities.measurement

data class Measurement (var success: Boolean? = null,
                        var data: List<DataMeasurement> = arrayListOf(),
                        var message: String? = null )