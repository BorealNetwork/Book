package com.example.book.domain

import com.example.book.ui.login.events.LogInEventsViewModel

//Code snippet 2.8
data class LogInUiStateAndEvents(
    val name: String = "",
    val password: String = ""
)

/**** Agrupando los states and event ****/
val LogInUiStateAndEvents.successValidated: Boolean
    get() = LogInEventsViewModel.applyLogicToValidateInputs(name, password)
