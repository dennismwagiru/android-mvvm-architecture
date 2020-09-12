package com.example.mvvmsampleapp.util

import android.content.Context
import android.widget.Toast

/**
 * Created by Dennis Joel on 9/12/2020.
 */

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}