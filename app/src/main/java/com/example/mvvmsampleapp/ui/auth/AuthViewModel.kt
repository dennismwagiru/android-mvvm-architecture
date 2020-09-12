package com.example.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

/**
 * Created by Dennis Joel on 9/12/2020.
 */

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
           authListener?.onFailure("Invalid email or password")

            return
        }
        authListener?.onSuccess()
    }
}