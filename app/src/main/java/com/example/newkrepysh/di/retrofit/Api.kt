package com.example.newkrepysh.di.retrofit

import com.example.newkrepysh.entities.ChildResponse
import com.example.newkrepysh.entities.ExampleJson2KtKotlin
import com.example.newkrepysh.entities.User
import com.example.newkrepysh.entities.achievements.GeneralAchievementsData
import com.example.newkrepysh.entities.auth.AuthBody
import com.example.newkrepysh.entities.measurement.Measurement
import com.example.newkrepysh.entities.news.GeneralNewsData
import com.example.newkrepysh.entities.parent.DataUser
import com.example.newkrepysh.entities.results.GeneralResultsData
import com.example.newkrepysh.entities.schoolstaff.SchoolStaff
import retrofit2.Response
import retrofit2.http.*


interface Api {

    @GET("/api/user")
    suspend fun getUser(): Response<DataUser>

    @POST("/api/login")
    suspend fun auth(@Body body: AuthBody): Response<ExampleJson2KtKotlin>

    @GET("/api/v2/children/{child_id}")
    suspend fun getChild(@Path("child_id") id: Int): Response<ChildResponse>

//    @GET("/api/v2/children/{child_id}/trainingsHistory")
//    fun getWorkoutHistory(@Path("child_id") id: Int): Response<>
//
//    @GET("/api/v2/children/{child_id}/trainingsByMonth")
//    fun getWorkoutTrainingsMonth(@Path("child_id") id: Int): Response<>

    @GET("/api/school/staff")
    fun getCoachTeam(): Response<SchoolStaff>

    @GET("/api/news")
    fun getNews(): Response<GeneralNewsData>

    @GET("api/v2/achievements/available")
    fun getAchivments(@Query("user_id") sd: Int): Response<GeneralAchievementsData>

    @GET("/api/v2/children/{child_id}/fullbody")
    fun getLastMeasurement(
        @Path("child_id") id: Int,
        @Query("limit") sd: Int
    ): Response<Measurement>

    @GET("/api/krepyshtest/results_by_child/{child_id}")
    fun getLastSeven(
        @Path("child_id") id: Int,
        @Query("limit") sd: Int
    ): Response<GeneralResultsData>

}