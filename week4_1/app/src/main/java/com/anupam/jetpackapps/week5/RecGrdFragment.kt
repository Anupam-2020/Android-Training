package com.anupam.jetpackapps.week5

import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anupam.jetpackapps.R


class RecGrdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rec_grd,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recDsh = view.findViewById<RecyclerView>(R.id.recDsh)
        recDsh.layoutManager = GridLayoutManager(getActivity(),2)

        val adapter =  RecDshAdapter(
            requireContext(),
            listOf(
                RecDsh("Home",R.drawable.ic_android),
                RecDsh("Admin",R.drawable.ic_setting),
                RecDsh("Settings", R.drawable.ic_profile),
                RecDsh("Profile", R.drawable.ic_android)
            )
        )

//        adapter.itemClick.subscribe {  // rxKotlin method.
//        when (it.menu) {
//        "Home" -> Log.i("@ani", "Home Clicked")
//        "Admin" -> Log.i("@ani", "Admin Clicked")
//        "Settings" -> Log.i("@ani", "Settings Clicked")
//        else -> Log.i("@ani", "Profile Clicked")
//        }
//        }

        adapter.itemClick.observe(viewLifecycleOwner) {  // liveData method.
//            when (it.menu) {
//                "Home" -> Log.i("@ani", "Home Clicked")
//                "Admin" -> Log.i("@ani", "Admin Clicked")
//                "Settings" -> Log.i("@ani", "Settings Clicked")
//                else -> Log.i("@ani", "Profile Clicked")
//            }

            when(it.menu) {
                "Home" -> activity?.supportFragmentManager?.commit {
                    replace<HomeFragment>(R.id.fragmentContainerView8)
                    this.addToBackStack("HomeFragment")
                }
                "Admin" -> activity?.supportFragmentManager?.commit {
                    replace<RecAdminFragment>(R.id.fragmentContainerView8)
                    this.addToBackStack("HomeFragment")
                }
                "Settings" -> activity?.supportFragmentManager?.commit {
                    replace<RecSettingsFragment>(R.id.fragmentContainerView8)
                    this.addToBackStack("HomeFragment")
                }
                else -> activity?.supportFragmentManager?.commit {
                    replace<RecAdminFragment>(R.id.fragmentContainerView8)
                    this.addToBackStack("HomeFragment")
                }
            }
        }
        recDsh.adapter = adapter
    }
}
