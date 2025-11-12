package com.example.book.ui.login.simple

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**** vista como source of truth  ****/
//Code snippet 2.2: Composables
@Composable
fun LoginScreenSimple(modifier: Modifier) {
    var name by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    ContactInformation(
        modifier = modifier.padding(top = 50.dp),
        name = name,
        //User name changed
        onNameChange = { name = it },
        password = password,
        //Password changed
        onPasswordChange = { password = it }
    )
}

@Composable
fun ContactInformation(
    name: String,
    onNameChange: (String) -> Unit,
    password: String,
    onPasswordChange: (String) -> Unit,
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
        //Pay order clicked
        Button(
            onClick = { println("Log In generated for $name and password $password") },
            enabled = name.length > 3 && password.length > 4
        ) { Text("Log In") }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewLoginScreenSimple() = LoginScreenSimple(Modifier)