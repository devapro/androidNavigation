package pro.devapp.navigation.ui.screens.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import pro.devapp.navigation.databinding.FragmentSplashBinding
import pro.devapp.navigation.navigation.AppNavigation
import pro.devapp.navigation.navigation.controllers.AppNavigationController
import pro.devapp.navigation.ui.common.NavigationFragment
import pro.devapp.navigation.ui.common.createNavigation
import pro.devapp.navigation.ui.common.viewBinding

class SplashFragment : NavigationFragment<AppNavigation>() {

    override val navigation: AppNavigation by createNavigation(AppNavigationController::class)
    override val viewModel by viewModels<SplashViewModel>()
    override val screenBinding by viewBinding(FragmentSplashBinding::inflate)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        screenBinding.goToLogin.setOnClickListener { navigation.openLogin() }
        screenBinding.goToPrivatePart.setOnClickListener { navigation.openMain() }

        return screenBinding.root
    }


}
