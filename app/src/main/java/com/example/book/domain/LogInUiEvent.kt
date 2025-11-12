package com.example.book.domain

//Code snippet 2.11
sealed class LogInUiEvent {
    data class OnNameChange(val name: String): LogInUiEvent()
    data class OnPasswordChange(val password: String): LogInUiEvent()
    data object LogInClicked: LogInUiEvent()
}