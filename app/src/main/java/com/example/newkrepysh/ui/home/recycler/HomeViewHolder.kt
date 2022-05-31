package com.example.newkrepysh.ui.home.recycler

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.KidsItemLayoutBinding
import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.User

class HomeViewHolder(item: KidsItemLayoutBinding, var context: Context): RecyclerView.ViewHolder(item.root) {

    private val name by lazy { item.kidName }
    private val secondName by lazy { item.kidSecondName }
    private val image by lazy { item.kidPhoto }
    

    fun bind(user: Childs?){
        itemView.setPadding(0, 10, 0, 0)
        name.text = user?.user?.firstName
        secondName.text = user?.user?.secondName
        println(user?.user?.media)
        Glide.with(context)
            .load(user?.user?.media?.firstOrNull()?.url?.profileThumb)
            .into(image)
    }
}