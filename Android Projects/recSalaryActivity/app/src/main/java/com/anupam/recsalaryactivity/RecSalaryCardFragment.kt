package com.anupam.recsalaryactivity

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.anupam.recsalaryactivity.databinding.FragmentRecSalaryCardBinding


class RecSalaryCardFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        activity?.title="Salary Card"

        val viewModel : SharedViewModel by activityViewModels()
        Log.i("@ani", "In Card Fragment")
        Log.i("@ani", viewModel.appData.value.toString())

        val binding = DataBindingUtil.inflate<FragmentRecSalaryCardBinding>(
            inflater,
            R.layout.fragment_rec_salary_card,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.vm = viewModel

        return binding.root

    }
}