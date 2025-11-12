package com.example.book.ui.login.states

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.book.domain.LogInUiState

//Code snippet 2.4: ViewModel definition
class LogInStatesViewModel : ViewModel() {

    /**** Agrupando los states ****/
    // UI's states
    var  logInUiState by mutableStateOf(LogInUiState())
        private set

    //UI's Events
    fun onNameChange(): (String) -> Unit = { logInUiState = logInUiState.copy(name = it) }

    fun onPasswordChange(): (String) -> Unit = { logInUiState = logInUiState.copy(password = it) }

    fun logIn(): () -> Unit = { println("Log In generated for ${logInUiState.name}  and password ${logInUiState.password}") }
}