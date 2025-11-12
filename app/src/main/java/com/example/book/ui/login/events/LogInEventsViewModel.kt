package com.example.book.ui.login.events

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.book.domain.LogInUiStateAndEvents
import com.example.book.domain.LogInUiEvent

class LogInEventsViewModel {
    /**** Agrupando los events ****/
    // UI's states
    var logInUiState by mutableStateOf(LogInUiStateAndEvents())
        private set

    //UI's Events
    fun onLogInEvent(logInEvent: LogInUiEvent) {
        when (logInEvent) {
            is LogInUiEvent.OnNameChange -> {
                logInUiState = logInUiState.copy(name = logInEvent.name)
            }

            is LogInUiEvent.OnPasswordChange -> {
                logInUiState = logInUiState.copy(password = logInEvent.password)
            }

            LogInUiEvent.LogInClicked -> {
                println("Sending form with parameters:${logInUiState.name} and ${logInUiState.password}")
            }
        }
    }

    companion object {
        fun applyLogicToValidateInputs(name: String, phone: String): Boolean {
            return name.length > 1 && phone.length > 3
        }
    }
}