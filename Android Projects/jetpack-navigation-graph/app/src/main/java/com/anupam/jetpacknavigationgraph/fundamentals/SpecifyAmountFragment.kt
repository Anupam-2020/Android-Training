package com.anupam.jetpacknavigationgraph.fundamentals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.anupam.jetpacknavigationgraph.R
import com.anupam.jetpacknavigationgraph.databinding.FragmentSpecifyAmountBinding


class SpecifyAmountFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private val args : SpecifyAmountFragmentArgs by navArgs()

    private lateinit var binding: FragmentSpecifyAmountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSpecifyAmountBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCon = findNavController()

        binding.textView2.text = "Sending Money to ${args.nm}"


        binding.button7.setOnClickListener {
            navCon.popBackStack(R.id.mainFragment,false)
        }

        binding.button6.setOnClickListener {
            val nm = args.nm
            val amt = binding.editTextTextPersonName2.text.toString().toInt()
            // navCon.navigate(R.id.action_specifyAmountFragment_to_confirmationFragment)
            val action = SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment(nm,amt)
            navCon.navigate(action)
        }
    }
}
