package com.example.apprecetario.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.apprecetario.screens.ScreenAlbondigas
import com.example.apprecetario.screens.ScreenMain
import com.example.apprecetario.screens.ScreenNuggets
import com.example.apprecetario.screens.ScreenPalomitas
import com.example.apprecetario.screens.ScreenPolloKFC


@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screen_Main, builder = {
        composable(Routes.screen_Main){
            ScreenMain(navController)
        }
        composable(Routes.screenAlbondigas){
            ScreenAlbondigas()
        }
        composable(Routes.screenNuggets){
            ScreenNuggets()
        }
        composable(Routes.screenPalomitas){
            ScreenPalomitas()
        }
        composable(Routes.screenPolloKFC){
            ScreenPolloKFC()
        }
    })
}