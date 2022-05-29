package com.example.newkrepysh.ui.dashboard.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newkrepysh.databinding.NewsItemLayoutBinding
import com.example.newkrepysh.entities.news.DataForNews
import com.example.newkrepysh.entities.news.DataNews
import com.example.newkrepysh.entities.news.News
import com.example.newkrepysh.ui.dashboard.PerformClickFromAdapter

class NewsAdapter(var onClick: PerformClickFromAdapter): RecyclerView.Adapter<NewsViewHolder>() {

    var list: List<DataForNews>? = listOf<DataForNews>()

    fun update(news: List<DataForNews>?){
        list = news
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val v = NewsItemLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return NewsViewHolder(v, parent.context)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(list?.get(position))
        holder.itemView.setOnClickListener {
            onClick.navigate(position)
        }
    }

    override fun getItemCount(): Int {
        return list?.size?: 0
    }
}