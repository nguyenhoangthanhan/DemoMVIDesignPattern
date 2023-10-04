package com.example.mvidesignpattern.data.api

import com.example.mvidesignpattern.data.model.User

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}