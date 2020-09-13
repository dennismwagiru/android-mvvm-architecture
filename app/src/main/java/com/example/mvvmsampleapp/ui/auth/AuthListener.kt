package com.example.mvvmsampleapp.ui.auth

import androidx.lifecycle.LiveData
import com.example.mvvmsampleapp.data.db.entities.User

/**
 * Created by Dennis Joel on 9/12/2020.
 */

interface AuthListener {
    fun onStarted()

    fun onSuccess(user: User)

    fun onFailure(message: String)
}