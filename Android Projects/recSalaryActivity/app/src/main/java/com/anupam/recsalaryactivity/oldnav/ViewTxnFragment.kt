package com.anupam.recsalaryactivity.oldnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anupam.recsalaryactivity.R
import com.anupam.recsalaryactivity.databinding.FragmentViewTxnBinding


class ViewTxnFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        requireActivity().title = "View Transaction"

        // Inflate the layout for this fragment
        val binding: FragmentViewTxnBinding = FragmentViewTxnBinding.inflate(
            inflater,
            container,
            false
        )

        binding.txtDt.text = "Data : INR. 1500"
        binding.txtFd.text = "Food : INR. 3000"

        return binding.root
    }

    companion object {

        fun newInstance() = ViewTxnFragment()

            }
    }
