package com.example.newkrepysh.ui.dashboard.recycler

import android.content.Context
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newkrepysh.databinding.NewsItemLayoutBinding
import com.example.newkrepysh.entities.news.DataForNews
import com.example.newkrepysh.entities.news.DataNews
import com.example.newkrepysh.entities.news.GeneralNewsData
import com.example.newkrepysh.entities.news.News

class NewsViewHolder(
    item: NewsItemLayoutBinding, var context: Context): RecyclerView.ViewHolder(item.root) {

    private val title by lazy { item.titleNews }
    private val description by lazy { item.descriptionNews }
    private val image by lazy { item.newsPhoto }
    val itemView by lazy { item }

    fun bind(news: DataForNews?){
        title.text = news?.header
        description.text = news?.shortDescription
        Glide.with(context)
            .load(news?.media)
            .into(image)
    }
}