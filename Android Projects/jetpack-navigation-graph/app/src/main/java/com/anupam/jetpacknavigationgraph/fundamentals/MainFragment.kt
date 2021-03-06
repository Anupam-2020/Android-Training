package com.anupam.jetpacknavigationgraph.fundamentals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.anupam.jetpacknavigationgraph.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToViewTxnFragment2() // method 2(google recommended.)
            findNavController().navigate(action)
            //findNavController().navigate(R.id.action_mainFragment_to_viewTxnFragment2) // Method 1
        }

        binding.button2.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToChooseRecipientFragment2()
            findNavController().navigate(action)
            // findNavController().navigate(R.id.action_mainFragment_to_chooseRecipientFragment2)
        }

        binding.button3.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToViewBalanceFragment2()
            findNavController().navigate(action)
            // findNavController().navigate(R.id.action_mainFragment_to_viewBalanceFragment2)
        }
    }
}
