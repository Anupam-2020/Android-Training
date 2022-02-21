package com.anupam.jetpackapps.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anupam.jetpackapps.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.title = "Profile Fragment"
        return inflater.inflate(
            R.layout.fragment_profile,
            container,
            false
        )
    }
}