package pro.devapp.navigation.ui.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import pro.devapp.navigation.databinding.FragmentMainBinding
import pro.devapp.navigation.navigation.PrivatePartNavigation
import pro.devapp.navigation.navigation.controllers.PrivatePartNavigationController
import pro.devapp.navigation.ui.common.NavigationFragment
import pro.devapp.navigation.ui.common.createNavigation
import pro.devapp.navigation.ui.common.viewBinding

class MainFragment : NavigationFragment<PrivatePartNavigation>() {

    override val navigation: PrivatePartNavigation by createNavigation(
        PrivatePartNavigationController::class
    )
    override val viewModel by viewModels<MainViewModel>()
    override val screenBinding by viewBinding(FragmentMainBinding::inflate)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return screenBinding.root
    }

}
