package pro.devapp.navigation.navigation.controllers

import androidx.navigation.NavController
import pro.devapp.navigation.navigation.PublicPartNavigation
import pro.devapp.navigation.ui.screens.confirm.ConfirmFragmentDirections
import pro.devapp.navigation.ui.screens.signIn.SignInFragmentDirections
import pro.devapp.navigation.ui.screens.signUp.SignUpFragmentDirections

class PublicPartNavigationController(navController: NavController) :
    BaseNavigationController(navController), PublicPartNavigation {
    override fun openConfirmScreen() {
        val action = SignUpFragmentDirections.actionSignUpFragmentToConfirmScreen()
        navigate(action)
    }

    override fun openSignUpScreen() {
        val action = SignInFragmentDirections.actionSignInFragmentToSignUpFragment()
        navigate(action)
    }

    override fun openMainAfterSignIn() {
        val action = SignInFragmentDirections.actionSignInFragmentToPrivatePartNavigation()
        navigate(action)
    }

    override fun openMainAfterConfirm() {
        val action = ConfirmFragmentDirections.actionConfirmScreenToPrivatePartNavigation()
        navigate(action)
    }
}