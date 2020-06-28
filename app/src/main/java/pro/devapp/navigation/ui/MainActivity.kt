package pro.devapp.navigation.ui

import android.os.Bundle
import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import pro.devapp.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        setSupportActionBar(mainBinding.toolbarWidget)
    }

    fun setScreenTitle(@StringRes titleStringId: Int) {
        mainBinding.toolbarWidget.setTitle(titleStringId)
    }

    fun toggleToolBar(hide: Boolean) {
        mainBinding.toolbarWidget.visibility = if (hide) View.GONE else View.VISIBLE
    }
}
