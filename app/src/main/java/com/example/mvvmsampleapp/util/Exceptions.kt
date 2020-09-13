package com.example.mvvmsampleapp.util

import java.io.IOException

/**
 * Created by Dennis Joel on 9/13/2020.
 */

class ApiException(message: String) : IOException(message)
class NoInternetException(message: String) : IOException(message)