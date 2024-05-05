package com.example.taskmanager.retrofit

import retrofit2.http.GET

interface UserApi {
    @GET("test?id=1")
    suspend fun getUserById(): User
}