package com.example.book.domain

import com.example.book.LogInViewModel

//Code snippet 2.8
data class LogInUiState(
    val name: String = "",
    val password: String = ""
)

/**** Agrupando los states ****/
val LogInUiState.successValidated: Boolean get() = name.length > 3 && password.length > 4
