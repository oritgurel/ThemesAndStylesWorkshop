package com.workshop7.themesandstylesworkshop.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.workshop7.themesandstylesworkshop.R

class NewsFragment : Fragment() {

    private lateinit var newsViewModel: NewsViewModel
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        newsViewModel =
                ViewModelProvider(this).get(NewsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_news, container, false)
        val recyclerview = root.findViewById<RecyclerView>(R.id.news_recyclerview)
        //TODO STEP 2: add item decoration to the recyclerview of type DividerItemDecoration()
        recyclerview.addItemDecoration(DividerItemDecoration(recyclerview.context, LinearLayout.VERTICAL))
        newsViewModel.newsData(findNavController().currentDestination?.id!!).observe(viewLifecycleOwner, Observer {
            if (recyclerview.adapter == null) {
                newsAdapter = NewsAdapter(it)
                recyclerview.adapter = newsAdapter
            } else {
                newsAdapter.setNews(it)
            }
        })
        return root
    }
}