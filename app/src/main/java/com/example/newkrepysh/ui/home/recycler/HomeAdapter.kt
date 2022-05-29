package com.example.newkrepysh.ui.home.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.newkrepysh.databinding.KidsItemLayoutBinding
import com.example.newkrepysh.entities.User
import com.example.newkrepysh.utils.MyDiffUtil

class HomeAdapter : RecyclerView.Adapter<HomeViewHolder>() {

    var list = listOf<User?>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        var v = KidsItemLayoutBinding.inflate(LayoutInflater.from(parent.context))
        v.root.layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        return HomeViewHolder(v, parent.context)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(list[position])

    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(newPersonalList: List<User?>) {
        val diffUtil = MyDiffUtil(list, newPersonalList)
        val difResults = DiffUtil.calculateDiff(diffUtil)
        list = newPersonalList
        difResults.dispatchUpdatesTo(this)
    }
}