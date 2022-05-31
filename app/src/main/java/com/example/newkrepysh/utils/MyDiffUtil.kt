package com.example.newkrepysh.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.User

class MyDiffUtil(
    private var oldList: List<Childs?>,
    private var newList: List<Childs?>
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition]?.id == newList[newItemPosition]?.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when {
            oldList[oldItemPosition]?.id != newList[newItemPosition]?.id ->{
                false
            }else -> true
        }
    }
}