package pro.devapp.navigation.ui.screens.signUp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import pro.devapp.navigation.databinding.FragmentSignUpBinding
import pro.devapp.navigation.navigation.PublicPartNavigation
import pro.devapp.navigation.navigation.controllers.PublicPartNavigationController
import pro.devapp.navigation.ui.common.NavigationFragment
import pro.devapp.navigation.ui.common.createNavigation
import pro.devapp.navigation.ui.common.viewBinding

class SignUpFragment : NavigationFragment<PublicPartNavigation>() {

    override val navigation: PublicPartNavigation by createNavigation(PublicPartNavigationController::class)
    override val viewModel by viewModels<SignUpViewModel>()
    override val screenBinding by viewBinding(FragmentSignUpBinding::inflate)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        screenBinding.button.setOnClickListener { navigation.openConfirmScreen() }

        return screenBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        toggleToolBar(false)
        displayHome()
        setTitle("SignUpFragment")
    }

}
