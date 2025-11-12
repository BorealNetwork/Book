package com.example.book

import androidx.lifecycle.ViewModel

//Code snippet 2.4: ViewModel definition
class LogInViewModel : ViewModel() {

    /**** ViewModel como source of truth ****/
    /*// UI's states
    var name by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set

    //UI's Events
    fun onNameChange(): (String) -> Unit = { name = it }

    fun onPasswordChange(): (String) -> Unit = { password = it }

    fun logIn(): () -> Unit = { println("Log In generated for $name and password $password") }*/

    /**** Agrupando los states ****/
    /*// UI's states
    var  logInUiState by mutableStateOf(LogInUiState())
        private set

    //UI's Events
    fun onNameChange(): (String) -> Unit = { logInUiState = logInUiState.copy(name = it) }

    fun onPasswordChange(): (String) -> Unit = { logInUiState = logInUiState.copy(password = it) }

    fun logIn(): () -> Unit = { println("Log In generated for ${logInUiState.name}  and password ${logInUiState.password}") }*/

    /**** Agrupando los states ****/
    // UI's states
//    var logInUiState by mutableStateOf(LogInUiState())
//        private set
//
//    //UI's Events
//    fun onLogInEvent(logInEvent: LogInUiEvent) {
//        when (logInEvent) {
//            is LogInUiEvent.OnNameChange -> {
//                logInUiState = logInUiState.copy(name = logInEvent.name)
//            }
//
//            is LogInUiEvent.OnPasswordChange -> {
//                logInUiState = logInUiState.copy(password = logInEvent.password)
//            }
//
//            LogInUiEvent.LogInClicked -> {
//                println("Sending form with parameters:${logInUiState.name} and ${logInUiState.password}")
//            }
//        }
//    }
//
//    companion object {
//        fun applyLogicToValidateInputs(name: String, phone: String): Boolean {
//            return name.length > 1 && phone.length > 3
//        }
//    }
}