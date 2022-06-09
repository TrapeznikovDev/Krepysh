package com.example.newkrepysh.ui.timetable.recyclers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newkrepysh.R
import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.timetable.TimetableTrainings

class GeneralRecyclerAdapter: RecyclerView.Adapter<GeneralRecyclerAdapter.GeneralViewHolder>() {

    var list = listOf<TimetableTrainings?>()

    fun update(data: List<TimetableTrainings>){
        list = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneralViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_timetable, parent, false)
        return GeneralViewHolder(v)
    }

    override fun onBindViewHolder(holder: GeneralViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class GeneralViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val text by lazy { view.findViewById(R.id.time_text) as TextView }
        fun bind(data: TimetableTrainings?){
            text.text = data?.start
        }
    }
}