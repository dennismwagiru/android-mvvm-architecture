package com.example.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

/**
 * Created by Dennis Joel on 9/12/2020.
 */

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    fun onLoginButtonClick(view: View) {
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            // TODO Display Error

            return
        }

        // TODO Success
    }
}