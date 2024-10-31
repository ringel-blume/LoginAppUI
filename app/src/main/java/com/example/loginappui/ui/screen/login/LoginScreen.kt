package com.example.loginappui.ui.screen.login

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.loginappui.R
import com.example.loginappui.ui.components.AuthenticationScreenTemplate
import com.example.loginappui.ui.theme.PrimaryPink
import com.example.loginappui.ui.theme.PrimaryPinkBlended
import com.example.loginappui.ui.theme.PrimaryPinkDark
import com.example.loginappui.ui.theme.PrimaryPinkLight

@Composable
fun LoginScreen(
    modifier: Modifier =  Modifier,
    onLoginClicked: () -> Unit,
    onRegistrationClicked: () -> Unit
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryPinkBlended,
            1f to PrimaryPink
        ) ,
        imgRes = R.drawable.img_login1,
        title  = "Welcome back!",
        subtitle = "Please, Log In",
        mainActionButtonTitle = "Continue",
        secondaryActionButtonTitle = "Create an Account",
        mainActionButtonColors =
                ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkDark,
            contentColor = Color.White
                ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = onLoginClicked,
        onSecondaryActionButtonClicked = onRegistrationClicked,
    )
}

