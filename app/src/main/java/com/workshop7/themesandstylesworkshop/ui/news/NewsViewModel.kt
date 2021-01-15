package com.workshop7.themesandstylesworkshop.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.workshop7.network.serviceModel.ArticlesItem
import com.workshop7.network.serviceModel.DataItem
import com.workshop7.network.serviceModel.MockData
import com.workshop7.themesandstylesworkshop.R

class NewsViewModel : ViewModel() {

    private fun mutableNewsItems(navItemId: Int) = MutableLiveData<List<ArticlesItem>>().apply {
        value = when (navItemId) {
            R.id.nav_health -> MockData.healthNews.articles!!
            R.id.nav_tech -> MockData.techNews.articles!!
            R.id.nav_entertainment -> MockData.entertainmentNews.articles!!
            else -> null
        }
    }
    fun newsData(navItemId: Int): LiveData<List<ArticlesItem>> = mutableNewsItems(navItemId)
}