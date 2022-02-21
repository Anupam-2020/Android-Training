package com.anupam.recsalaryactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.anupam.recsalaryactivity.databinding.FragmentRecSalaryDetailsBinding


class RecSalaryDetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    val viewModel : SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        activity?.title="Salary Details"



        val binding = DataBindingUtil.inflate<FragmentRecSalaryDetailsBinding>(
            inflater,
            R.layout.fragment_rec_salary_details,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.vm = viewModel

        return binding.root
    }

}