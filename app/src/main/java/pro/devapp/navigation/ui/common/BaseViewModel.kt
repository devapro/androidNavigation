package pro.devapp.navigation.ui.common

import android.app.Application
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel

open class BaseViewModel(application: Application) : AndroidViewModel(application) {
    fun getStringRes(@StringRes resId: Int): String {
        return getApplication<Application>().resources.getString(resId)
    }

    fun getColorRes(@ColorRes resId: Int): Int {
        return ContextCompat.getColor(getApplication<Application>(), resId)
    }
}