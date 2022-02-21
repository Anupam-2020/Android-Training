package com.anupam.week5.recyclerActivity

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anupam.week5.R


class RecGrdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rec_grd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recDsh = view.findViewById<RecyclerView>(R.id.recDsh)
        recDsh.layoutManager = GridLayoutManager(activity,2)

        val lst = listOf(RecDsh("Home"), RecDsh("Admin"), RecDsh("Settings"))

        val adapter = RecDshAdapter(
            requireContext(),
            lst
        )

        adapter.itemClick.observe(viewLifecycleOwner) {
            when(it.menu) {
                "Home" -> Log.i("@anu","Home Clicked")
                "Admin" -> Log.i("@anu","Admin Clicked")
                "Settings" -> Log.i("@anu","Settings Clicked")
            }
        }

        recDsh.adapter = adapter
    }
}