package com.example.mvvmsampleapp.data.network.responses

import com.example.mvvmsampleapp.data.db.entities.User

/**
 * Created by Dennis Joel on 9/13/2020.
 */

data class AuthResponse (
    val isSuccessful : Boolean?,
    val message: String?,
    val user: User?
)