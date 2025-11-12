package com.example.book.ui.login.states

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.book.domain.successValidated

/**** Agrupando los states ****/
@Composable
fun LoginScreenStates(logInviewModel: LogInStatesViewModel = viewModel(), modifier: Modifier) {

    ContactInformation(
        modifier = modifier,
        name = logInviewModel.logInUiState.name,
        onNameChange = logInviewModel.onNameChange(),
        password = logInviewModel.logInUiState.password,
        onPasswordChange = logInviewModel.onPasswordChange(),
        logIn = logInviewModel.logIn(),
        isValidLogIn = logInviewModel.logInUiState.successValidated
    )
}

@Composable
fun ContactInformation(
    name: String,
    onNameChange: (String) -> Unit,
    password: String,
    onPasswordChange: (String) -> Unit,
    logIn: ()-> Unit,
    isValidLogIn: Boolean,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            label = { Text("User name") },
            value = name,
            onValueChange = onNameChange
        )
        Spacer(Modifier.padding(5.dp))
        TextField(
            label = { Text("Password") },
            value = password,
            onValueChange = onPasswordChange
        )
        Spacer(Modifier.padding(5.dp))
        Button(
            onClick = logIn,
            enabled = isValidLogIn
        ) { Text("Log In") }
    }
}