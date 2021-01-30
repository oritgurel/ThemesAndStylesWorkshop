package com.workshop7.themesandstylesworkshop

import android.content.res.Resources
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.ui.*
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.workshop7.themesandstylesworkshop.NewsApp.Companion.isProTheme

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController

    private var isPro: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            showPremiumDialog()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(
                R.id.nav_health, R.id.nav_tech, R.id.nav_entertainment), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        isPro = resources.getBoolean(R.bool.isPro)
    }

    override fun getTheme(): Resources.Theme {
        val newTheme = super.getTheme()
        //we're in free/main flavor
        if (isProTheme) {
            newTheme.applyStyle(R.style.AppTheme_Pro, true)
        }
        return newTheme
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun showPremiumDialog() {
        val becomePremiumDialog = !isPro && !isProTheme
        //TODO STEP 6: change this AlertDialog.Builder's constructor theme to the new "AppTheme.IapDialogTheme" theme. Don't forget to replace the inheritance dot notation to "_" in res id.
        val builder = MaterialAlertDialogBuilder(this, R.style.ThemeOverlay_MaterialComponents_Dialog_Alert)
                .setTitle(if (becomePremiumDialog) R.string.premium_popup_title else R.string.you_are_premium_title)
                .setMessage(R.string.premium_popup_message)
                if (!isPro) {
                    builder.setPositiveButton(if (becomePremiumDialog) R.string.become_premium_positive_btn else R.string.quite_premium_positive_btn) { dialog, _ ->
                        isProTheme = !isProTheme
                        dialog.dismiss()
                        recreate()
                    }
                }
                builder.create().show()
    }
}