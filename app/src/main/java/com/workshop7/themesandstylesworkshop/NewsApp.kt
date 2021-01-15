package com.workshop7.themesandstylesworkshop

import android.app.Application
import android.content.res.Resources

class NewsApp: Application() {

    companion object {
        var shouldChangeDefaultTheme: Boolean = false
    }
}