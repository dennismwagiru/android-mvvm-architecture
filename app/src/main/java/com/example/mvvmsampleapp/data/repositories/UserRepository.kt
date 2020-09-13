package com.example.mvvmsampleapp.data.repositories

import com.example.mvvmsampleapp.data.db.AppDatabase
import com.example.mvvmsampleapp.data.db.entities.User
import com.example.mvvmsampleapp.data.network.MyApi
import com.example.mvvmsampleapp.data.network.SafeApiRequest
import com.example.mvvmsampleapp.data.network.responses.AuthResponse
import retrofit2.Response

/**
 * Created by Dennis Joel on 9/12/2020.
 */

class UserRepository(
    private val api: MyApi,
    private val db: AppDatabase
) : SafeApiRequest() {

    suspend fun userLogin(email: String, password: String) : AuthResponse {
       return apiRequest { api.userLogin(email, password) }
    }

    suspend fun saveUser(user: User) = db.getUserDao().upsert(user)

    fun getUser() = db.getUserDao().getUser()
}