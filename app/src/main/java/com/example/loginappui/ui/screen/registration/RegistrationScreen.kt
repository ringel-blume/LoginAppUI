package com.example.loginappui.ui.screen.registration

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.loginappui.R
import com.example.loginappui.ui.components.AuthenticationScreenTemplate
import com.example.loginappui.ui.theme.DarkTextColor
import com.example.loginappui.ui.theme.PrimaryPink
import com.example.loginappui.ui.theme.PrimaryPinkBlended
import com.example.loginappui.ui.theme.PrimaryPinkDark
import com.example.loginappui.ui.theme.PrimaryPinkLight
import com.example.loginappui.ui.theme.PrimaryViolet
import com.example.loginappui.ui.theme.PrimaryVioletDark
import com.example.loginappui.ui.theme.PrimaryVioletLight
import kotlinx.coroutines.selects.RegistrationFunction

@Composable
fun RegistrationScreen(
    modifier: Modifier = Modifier,
    onRegisterClicked : () -> Unit,
    onLoginClicked: () -> Unit
)
    {
        AuthenticationScreenTemplate(
            modifier = modifier,
            backgroundGradient = arrayOf(
                0f to PrimaryViolet,
                1f to PrimaryVioletDark
            ) ,
            imgRes = R.drawable.img_coder,
            title  = "Hi there!",
            subtitle = "Let's Get Started",
            mainActionButtonTitle = "Create an Account",
            secondaryActionButtonTitle = "Log In",
            mainActionButtonColors =
            ButtonDefaults.buttonColors(
                containerColor = PrimaryVioletDark,
                contentColor = Color.White
            ),
            secondaryActionButtonColors = ButtonDefaults.buttonColors(
                containerColor = PrimaryVioletLight,
                contentColor = Color.White
            ),
            actionButtonShadow = PrimaryVioletDark,
            onMainActionButtonClicked = onRegisterClicked ,
            onSecondaryActionButtonClicked = onLoginClicked,
        )

        }

