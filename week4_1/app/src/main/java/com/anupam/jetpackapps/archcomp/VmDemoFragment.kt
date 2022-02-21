package com.anupam.jetpackapps.archcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anupam.jetpackapps.R
import com.anupam.jetpackapps.databinding.FragmentVmDemoBinding

class VmDemoFragment : Fragment() {

    private lateinit var binding: FragmentVmDemoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentVmDemoBinding.inflate(inflater,container,false)
        return binding.root
    }
}
