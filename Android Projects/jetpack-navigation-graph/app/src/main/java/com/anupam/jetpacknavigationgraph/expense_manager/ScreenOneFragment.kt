package com.anupam.jetpacknavigationgraph.expense_manager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.anupam.jetpacknavigationgraph.R
import com.anupam.jetpacknavigationgraph.databinding.ActivityExpenseBinding
import com.anupam.jetpacknavigationgraph.databinding.FragmentScreenOneBinding


class ScreenOneFragment : Fragment() {

    private lateinit var binding: FragmentScreenOneBinding

     private val args : ScreenOneFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentScreenOneBinding.inflate(
            inflater,
            container,
            false
        )

        binding.textView12.text = "${args.item}"
        binding.textView13.text = "${args.price}"

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.button10.setOnClickListener {
            val action = ScreenOneFragmentDirections.actionScreenOneFragmentToScreenTwoFragment()
            findNavController().navigate(action)
        }

        binding.textView12.setOnClickListener {
            val item = binding.textView12.text.toString()
            val pr = binding.textView13.text.toString()
            val dt = binding.textView14.text.toString()
            val abt = binding.textView15.text.toString()
            val action = ScreenOneFragmentDirections.actionScreenOneFragmentToScreenThreeFragment(item,pr,dt,abt)
            findNavController().navigate(action)
        }
    }
}