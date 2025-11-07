package com.example.questnavigasitugas_067

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Welcome,
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Welcome.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.Welcome.name) {
                WelcomeScreen(
                    onSubmitClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
        }
    }
}