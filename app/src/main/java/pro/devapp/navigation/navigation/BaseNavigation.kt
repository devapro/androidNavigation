package pro.devapp.navigation.navigation

import android.os.Bundle

interface BaseNavigation {
    fun back()
    fun <T> getParams(bundle: Bundle?, key: String): T?
    fun <T> getNonNullParams(bundle: Bundle, key: String): T
}