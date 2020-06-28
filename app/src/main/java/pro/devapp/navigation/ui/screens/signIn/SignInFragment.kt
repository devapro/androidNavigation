package pro.devapp.navigation.ui.screens.signIn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import pro.devapp.navigation.databinding.FragmentSignInBinding
import pro.devapp.navigation.navigation.PublicPartNavigation
import pro.devapp.navigation.navigation.controllers.PublicPartNavigationController
import pro.devapp.navigation.ui.common.NavigationFragment
import pro.devapp.navigation.ui.common.createNavigation
import pro.devapp.navigation.ui.common.viewBinding

class SignInFragment : NavigationFragment<PublicPartNavigation>() {

    override val navigation: PublicPartNavigation by createNavigation(PublicPartNavigationController::class)
    override val viewModel by viewModels<SignInViewModel>()
    override val screenBinding by viewBinding(FragmentSignInBinding::inflate)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        screenBinding.goToSignUp.setOnClickListener { navigation.openSignUpScreen() }
        screenBinding.goToMain.setOnClickListener { navigation.openMainAfterSignIn() }

        return screenBinding.root
    }

}
