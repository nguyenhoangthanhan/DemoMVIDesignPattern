package com.example.mvidesignpattern.data.repository

import com.example.mvidesignpattern.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}