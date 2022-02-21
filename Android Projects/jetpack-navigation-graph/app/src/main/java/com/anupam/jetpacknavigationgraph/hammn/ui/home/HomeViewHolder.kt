package com.anupam.jetpacknavigationgraph.hammn.ui.home

import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.anupam.jetpacknavigationgraph.R

class HomeViewHolder(
    private val itemView: View
): RecyclerView.ViewHolder(itemView) {
    fun from() = itemView.findViewById<TextView>(R.id.textView7)

    fun time() = itemView.findViewById<TextView>(R.id.textView8)

    fun switch() = itemView.findViewById<Switch>(R.id.switch1)

    fun root() = itemView
}