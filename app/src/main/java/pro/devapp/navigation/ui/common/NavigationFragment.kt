package pro.devapp.navigation.ui.common

import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import pro.devapp.navigation.navigation.BaseNavigation
import pro.devapp.navigation.ui.MainActivity

abstract class NavigationFragment<T : BaseNavigation> : Fragment() {

    protected abstract val navigation: T
    protected abstract val viewModel: BaseViewModel
    protected abstract val screenBinding: ViewBinding

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                findNavController().popBackStack()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        toggleToolBar(true)
    }

    protected fun toggleToolBar(hide: Boolean) {
        setHasOptionsMenu(!hide)
        (activity as MainActivity).toggleToolBar(hide)
    }

    protected fun setScreenTitle(@StringRes titleStringId: Int) {
        (activity as MainActivity).setScreenTitle(titleStringId)
    }

    protected fun displayHome() {
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    protected fun setTitle(title: String) {
        (activity as MainActivity).supportActionBar?.title = title
    }
}