package com.example.newkrepysh.ui.home.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.newkrepysh.databinding.KidsItemLayoutBinding
import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.User
import com.example.newkrepysh.ui.dashboard.PerformClickFromAdapter
import com.example.newkrepysh.ui.dashboard.PerformClickFromAdapterForKid
import com.example.newkrepysh.utils.MyDiffUtil

class HomeAdapter(var onClick: PerformClickFromAdapterForKid) : RecyclerView.Adapter<HomeViewHolder>() {

    var list = listOf<Childs?>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        var v = KidsItemLayoutBinding.inflate(LayoutInflater.from(parent.context))
        v.root.layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        return HomeViewHolder(v, parent.context)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(list[position])

        holder.itemView.setOnClickListener {
            onClick.navigate(list.get(position)?.id?: 0, list.get(position)?.userId?: 0)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(newPersonalList: List<Childs?>) {
        val diffUtil = MyDiffUtil(list, newPersonalList)
        val difResults = DiffUtil.calculateDiff(diffUtil)
        list = newPersonalList
        difResults.dispatchUpdatesTo(this)
    }
}