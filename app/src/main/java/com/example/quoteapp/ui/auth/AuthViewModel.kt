package com.example.quoteapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {
    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun clickToLogin(view: View) {
        authListener?.onStarted()

        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Both fields are required")
            return
        }

        //Success
        authListener?.onSuccess()
    }
}