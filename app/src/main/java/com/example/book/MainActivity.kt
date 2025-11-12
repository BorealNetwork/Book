package com.example.book

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.book.ui.login.simple.LoginScreenSimple
import com.example.book.ui.theme.BookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            BookTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    /**** ViewModel como source of truth ****/
                    LoginScreenSimple(modifier = Modifier.padding(innerPadding))

                    /**** ViewModel como source of truth ****/
//                    LoginScreenVM(modifier = Modifier.padding(innerPadding))

                    /**** Agrupando los states ****/
//                    LoginScreenStates(modifier = Modifier.padding(innerPadding))

                    /**** Agrupando los states ****/
//                    LoginScreenEvents(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}