package com.example.book.domain

//Code snippet 2.8
data class LogInUiStateAndEvents(
    val name: String = "",
    val password: String = ""
) {
    fun applyLogicToValidateInputs(name: String, phone: String): Boolean {
        return name.length > 1 && phone.length > 3
    }
}

/**** Agrupando los states and event ****/
val LogInUiStateAndEvents.successValidated: Boolean get() = applyLogicToValidateInputs(name, password)
