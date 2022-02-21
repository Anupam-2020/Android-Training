package com.anupam.jetpacknavigationgraph.expense_manager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.anupam.jetpacknavigationgraph.R
import com.anupam.jetpacknavigationgraph.databinding.FragmentScreenOneBinding
import com.anupam.jetpacknavigationgraph.databinding.FragmentScreenTwoBinding


class ScreenTwoFragment : Fragment() {


    private lateinit var binding: FragmentScreenTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScreenTwoBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button9.setOnClickListener {
            val vm = binding.editTextTextPersonName3.text.toString()
            val pr = binding.editTextTextPersonName4.text.toString()
            val abt = binding.editTextTextPersonName5.text.toString()
            val dt = binding.editTextDate.text.toString()
            val action = ScreenTwoFragmentDirections.actionScreenTwoFragmentToScreenOneFragment(vm,pr,abt,dt)
            findNavController().navigate(action)
        }
    }
}
