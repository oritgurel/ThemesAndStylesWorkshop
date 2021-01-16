package com.workshop7.themesandstylesworkshop.ui.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.workshop7.network.serviceModel.ArticlesItem
import com.workshop7.themesandstylesworkshop.R

class NewsAdapter(news: List<ArticlesItem>) : RecyclerView.Adapter<NewsViewHolder>() {
    private val news: MutableList<ArticlesItem> = news.toMutableList()

    fun setNews(news: List<ArticlesItem>) {
        this.news.apply {
            clear()
            addAll(news)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.li_news, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(news[position])
    }
}

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title = itemView.findViewById<TextView>(R.id.li_news_title)
    private val image = itemView.findViewById<ImageView>(R.id.li_news_image)
    private val desc = itemView.findViewById<TextView>(R.id.li_news_desc)
    fun bind(newsItem: ArticlesItem) {
        title.text = newsItem.title
        Glide.with(image.context).load(newsItem.urlToImage).into(image)
        desc.text = newsItem.description
    }
}