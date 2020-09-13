package com.example.mvvmsampleapp.data.repositories

import com.example.mvvmsampleapp.data.network.MyApi
import com.example.mvvmsampleapp.data.network.SafeApiRequest
import com.example.mvvmsampleapp.data.network.responses.AuthResponse
import retrofit2.Response

/**
 * Created by Dennis Joel on 9/12/2020.
 */

class UserRepository : SafeApiRequest() {

    suspend fun userLogin(email: String, password: String) : AuthResponse {
       return apiRequest { MyApi().userLogin(email, password) }
    }

}