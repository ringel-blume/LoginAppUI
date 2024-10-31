package com.example.loginappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.loginappui.ui.screen.container.ScreenContainer
import com.example.loginappui.ui.theme.LoginAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppUITheme {
             ScreenContainer()

            }
        }
    }
}
