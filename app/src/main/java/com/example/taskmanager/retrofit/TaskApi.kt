package com.example.taskmanager.retrofit

import retrofit2.http.GET

interface TaskApi {
    @GET("task?id=1")
    suspend fun getTaskById(): Task
}