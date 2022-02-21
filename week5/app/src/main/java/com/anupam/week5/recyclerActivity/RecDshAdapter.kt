package com.anupam.week5.recyclerActivity

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.anupam.week5.R
import javax.sql.CommonDataSource

data class RecDsh(
    val menu : String
)


class RecDshViewHolder(private val view : View) : RecyclerView.ViewHolder(view) {
    fun label() = view.findViewById<TextView>(R.id.lbMnu)
    fun rootView() = view
}


class RecDshAdapter(
    private val context: Context,
    private val dataSource: List<RecDsh>
) : RecyclerView.Adapter<RecDshViewHolder>() {

    private val _itemClick = MutableLiveData<RecDsh>()
    val itemClick : LiveData<RecDsh> = _itemClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecDshViewHolder {
        val vm = LayoutInflater.from(context).inflate(R.layout.rec_dsh_item,parent,false)
        return RecDshViewHolder(vm)
    }

    override fun onBindViewHolder(holder: RecDshViewHolder, position: Int) {
        holder.rootView().setOnClickListener{
            val clickedItem = it.tag as RecDsh

            when(clickedItem.menu) {
                "Home" -> Log.i("@anu","Home Clicked")
                "Admin" -> Log.i("@anu","Admin Clicked")
                "Settings" -> Log.i("@anu","Profile Clicked")
            }
        }
        holder.rootView().tag = dataSource[position]
        holder.label().text = dataSource[position].menu
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }
}