package com.example.newkrepysh.ui.profile.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.newkrepysh.R
import com.example.newkrepysh.entities.kidprofile.DataObject
import com.example.newkrepysh.ui.dashboard.PerformClickFromAdapter
import com.example.newkrepysh.ui.profile.KidPossibleHandler
import kotlinx.android.synthetic.main.text_for_kids_profile_recycler.view.*

class KidsProfileAdapter(private val data: List<String>, var onClick: KidPossibleHandler): RecyclerView.Adapter<KidsProfileAdapter.KidsProfileViewHolder>() {

    private val items: MutableList<CardView>



    init {
        this.items = ArrayList()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KidsProfileViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.text_for_kids_profile_recycler, parent, false)
        return KidsProfileViewHolder(v)
    }

    override fun onBindViewHolder(holder: KidsProfileViewHolder, position: Int) {
        holder.tvTitle.text = data[position]
        items.add(holder.card)

        holder.itemView.setOnClickListener {
            onClick.handler(position)
        }
    }

    override fun getItemCount(): Int = data.size

    inner class KidsProfileViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvTitle: TextView = view.textView
        val card: CardView = view.card

    }
}

