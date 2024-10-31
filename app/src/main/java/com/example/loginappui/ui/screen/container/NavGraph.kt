package com.example.loginappui.ui.screen.container

import android.health.connect.datatypes.ExerciseRoute

sealed class NavGraph (val route: String){

    data object Welcome: NavGraph(route = "welcome_screen")
    data object Login: NavGraph(route = "login_screen")
    data object Registration: NavGraph(route = "registration_screen")
    data object Home: NavGraph(route = "home_screen")

}