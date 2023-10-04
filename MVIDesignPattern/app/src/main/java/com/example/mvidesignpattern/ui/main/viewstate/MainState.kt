package com.example.mvidesignpattern.ui.main.viewstate

import com.example.mvidesignpattern.data.model.User

sealed class MainState {
    object Idle : MainState()
    object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()

}