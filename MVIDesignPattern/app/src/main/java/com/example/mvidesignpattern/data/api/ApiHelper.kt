package com.example.mvidesignpattern.data.api

import com.example.mvidesignpattern.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>

}