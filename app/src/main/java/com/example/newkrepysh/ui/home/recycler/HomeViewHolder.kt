package com.example.newkrepysh.ui.home.recycler

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.KidsItemLayoutBinding
import com.example.newkrepysh.entities.User

class HomeViewHolder(item: KidsItemLayoutBinding, var context: Context): RecyclerView.ViewHolder(item.root) {

    private val name by lazy { item.kidName }
    private val secondName by lazy { item.kidSecondName }
    private val image by lazy { item.kidPhoto }
    

    fun bind(user: User?){
        itemView.setPadding(0, 10, 0, 0)
        name.text = user?.firstName
        secondName.text = user?.secondName
        println(user?.media)
        Glide.with(context)
            .load(user?.media?.firstOrNull()?.url?.profileThumb)
            .into(image)
    }
}