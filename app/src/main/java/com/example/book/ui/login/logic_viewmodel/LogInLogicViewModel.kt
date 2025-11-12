package com.example.book.ui.login.logic_viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

//Code snippet 2.4: ViewModel definition
class LogInLogicViewModel : ViewModel() {

    /**** ViewModel como source of truth ****/
    // UI's states
    var name by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set

    //UI's Events
    fun onNameChange(): (String) -> Unit = { name = it }

    fun onPasswordChange(): (String) -> Unit = { password = it }

    fun logIn(): () -> Unit = { println("Log In generated for $name and password $password") }

    fun isLoginValid() = name.length > 3 && password.length > 4
}