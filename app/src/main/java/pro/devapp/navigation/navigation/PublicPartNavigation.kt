package pro.devapp.navigation.navigation

interface PublicPartNavigation : BaseNavigation {
    fun openConfirmScreen()
    fun openSignUpScreen()
    fun openMainAfterSignIn()
    fun openMainAfterConfirm()
}