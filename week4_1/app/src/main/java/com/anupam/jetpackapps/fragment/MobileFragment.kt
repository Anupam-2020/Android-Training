package com.anupam.jetpackapps.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anupam.jetpackapps.R

class MobileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vw = inflater.inflate(R.layout.fragment_mobile, container, false)
        return vw
    }
}
