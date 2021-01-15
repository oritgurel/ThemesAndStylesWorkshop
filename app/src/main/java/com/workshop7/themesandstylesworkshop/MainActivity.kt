package com.workshop7.themesandstylesworkshop

import android.content.res.Resources
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.ui.*
import com.workshop7.themesandstylesworkshop.NewsApp.Companion.shouldChangeDefaultTheme

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController


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
    }

    override fun getTheme(): Resources.Theme {
        val newTheme = super.getTheme()
        if (shouldChangeDefaultTheme) {
            newTheme.applyStyle(R.style.ThemeOverlay_AppCompat_Dark, true)
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
        //todo set the theme
        AlertDialog.Builder(this)
                .setTitle(R.string.premium_popup_title)
                .setMessage("* All hot news \n* Personalized notifications \n* More hot news")
                .setPositiveButton("Join") { dialog, _ ->
                    shouldChangeDefaultTheme = true
                    dialog.dismiss()
                    recreate()
                }
                .setNegativeButton("Later") { dialog, _ ->
                    dialog.dismiss()
                }
                .create().show()
    }
}