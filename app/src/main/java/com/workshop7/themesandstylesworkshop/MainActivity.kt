package com.workshop7.themesandstylesworkshop

import android.content.res.Resources
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate.*
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.ui.*
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
        if (isProTheme) return
        val builder = AlertDialog.Builder(this, R.style.Theme_MaterialComponents_DayNight_Dialog_Alert)
                .setTitle(R.string.premium_popup_title)
                .setMessage(R.string.premium_popup_message)
                if (!isPro) {
                    builder.apply {
                        setPositiveButton("Join") { dialog, _ ->
                        isProTheme = true
                        dialog.dismiss()
                        recreate()
                        }
                    }
                }
                builder.create().show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.force_dark -> setDefaultNightMode(MODE_NIGHT_YES)
            R.id.force_light -> setDefaultNightMode(MODE_NIGHT_NO)
            R.id.system_default -> setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}