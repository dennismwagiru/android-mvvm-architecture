package com.example.mvvmsampleapp.ui.auth

import androidx.lifecycle.LiveData

/**
 * Created by Dennis Joel on 9/12/2020.
 */

interface AuthListener {
    fun onStarted()

    fun onSuccess(loginResponse: LiveData<String>)

    fun onFailure(message: String)
}