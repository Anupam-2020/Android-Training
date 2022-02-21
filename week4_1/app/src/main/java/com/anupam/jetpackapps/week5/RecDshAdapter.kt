package com.anupam.jetpackapps.week5

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.anupam.jetpackapps.R
import io.reactivex.rxjava3.subjects.PublishSubject

data class RecDsh(

    val menu : String,
    val icon : Int
)


class RecDshAdapter(
    val context: Context,
    val dataSource: List<RecDsh>
): RecyclerView.Adapter<RecDshViewHolder>(){

    private val _itemClick = MutableLiveData<RecDsh>()
     val itemClick : LiveData<RecDsh> = _itemClick
    // val itemClick = PublishSubject.create<RecDsh>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecDshViewHolder {

        val vw = LayoutInflater.from(context).inflate(R.layout.rec_dsh_item,parent,false)
        return RecDshViewHolder(vw)
    }

    override fun onBindViewHolder(holder: RecDshViewHolder, position: Int) {

        holder.itemView.setOnClickListener{

            val clickedItem = it.tag as RecDsh // Live Data
            // itemClick.onNext(clickedItem) // RxKotlin Method.
             _itemClick.value = clickedItem

//            when (clickedItem.menu) {
//                "Home" -> Log.i("@anu","Home Clicked")
//                "Admin" -> Log.i("@anu","Admin Clicked")
//                "Profile" -> Log.i("@anu","Profile Clicked")
//                else -> Log.i("@anu","Settings Clicked")
//            }
        }

        holder.itemView.tag = dataSource[position]
        holder.icon().setImageResource(dataSource[position].icon)
        holder.label().setText(dataSource[position].menu)

    }

    override fun getItemCount(): Int {

        return dataSource.size
    }

}

class RecDshViewHolder(private val view : View): RecyclerView.ViewHolder(view) {
//    fun root(): View {
//        return view
//    }
    fun icon() = view.findViewById<ImageView>(R.id.imageView)
    fun label() = view.findViewById<TextView>(R.id.lbMnu)
}
