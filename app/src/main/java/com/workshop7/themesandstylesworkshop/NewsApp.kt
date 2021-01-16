package com.workshop7.themesandstylesworkshop

import android.app.Application

class NewsApp: Application() {
    companion object {
        var isProTheme: Boolean = false
    }

    override fun onCreate() {
        super.onCreate()
        isProTheme = resources.getBoolean(R.bool.isPro)
    }
}