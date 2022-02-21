package com.anupam.jetpacknavigationgraph.expense_manager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.anupam.jetpacknavigationgraph.R
import com.anupam.jetpacknavigationgraph.databinding.FragmentScreenThreeBinding
import com.anupam.jetpacknavigationgraph.databinding.FragmentScreenTwoBinding


class ScreenThreeFragment : Fragment() {

    private val args : ScreenThreeFragmentArgs by navArgs()

    private lateinit var binding: FragmentScreenThreeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScreenThreeBinding.inflate(
            inflater,
            container,
            false
        )

        binding.textView20.text = "${args.item}"
        binding.textView21.text = "${args.price}"
        binding.textView22.text = "${args.date}"
        binding.textView23.text = "${args.about}"


        return binding.root
    }

}