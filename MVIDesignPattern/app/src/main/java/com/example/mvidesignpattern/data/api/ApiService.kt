package com.example.mvidesignpattern.data.api

import com.example.mvidesignpattern.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}