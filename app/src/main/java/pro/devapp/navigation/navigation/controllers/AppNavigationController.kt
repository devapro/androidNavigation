package pro.devapp.navigation.navigation.controllers

import androidx.navigation.NavController
import pro.devapp.navigation.navigation.AppNavigation
import pro.devapp.navigation.ui.screens.splash.SplashFragmentDirections

class AppNavigationController(navController: NavController) :
    BaseNavigationController(navController), AppNavigation {
    override fun openLogin() {
        val action = SplashFragmentDirections.actionSplashFragmentToPublicPartNavigation()
        navigate(action)
    }

    override fun openMain() {
        val action = SplashFragmentDirections.actionSplashFragmentToPrivatePartNavigation()
        navigate(action)
    }
}