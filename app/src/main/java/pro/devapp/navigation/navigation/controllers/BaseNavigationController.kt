package pro.devapp.navigation.navigation.controllers

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import pro.devapp.navigation.navigation.BaseNavigation

open class BaseNavigationController(private val navController: NavController) : BaseNavigation {
    override fun back() {
        navController.popBackStack()
    }

    protected fun navigate(navDirections: NavDirections) {
        navController.navigate(navDirections)
    }

    override fun <T> getParams(bundle: Bundle?, key: String): T? {
        val param = bundle?.get(key)
        return param?.let {
            @Suppress("UNCHECKED_CAST")
            return@let it as T
        }
    }

    override fun <T> getNonNullParams(bundle: Bundle, key: String): T {
        val param = bundle.get(key)
        return param.let {
            @Suppress("UNCHECKED_CAST")
            return@let it as T
        }
    }
}