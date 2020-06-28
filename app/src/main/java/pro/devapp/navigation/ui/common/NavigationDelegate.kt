package pro.devapp.navigation.ui.common

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import pro.devapp.navigation.navigation.BaseNavigation
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

class NavigationDelegate<T : BaseNavigation>(
    val fragment: Fragment,
    val factory: (navController: NavController) -> T
) :
    ReadOnlyProperty<Fragment, T> {
    private var controller: T? = null

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        val controller = controller
        if (controller != null) {
            return controller
        }
        return factory(thisRef.findNavController()).also {
            this.controller = it
        }
    }
}

fun <T : BaseNavigation, E : T> NavigationFragment<T>.createNavigation(controllerClass: KClass<E>) =
    NavigationDelegate(this) {
        controllerClass.constructors.first().call(findNavController())
    }