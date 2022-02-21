package com.anupam.jetpacknavigationgraph.fundamentals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.anupam.jetpacknavigationgraph.databinding.FragmentChooseRecipientBinding


class ChooseRecipientFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private lateinit var binding: FragmentChooseRecipientBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChooseRecipientBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCon = findNavController()

        binding.button4.setOnClickListener {
            val nm = binding.editTextTextPersonName.text.toString()
            val action =
                ChooseRecipientFragmentDirections.actionChooseRecipientFragment2ToSpecifyAmountFragment(
                    nm)
            navCon.navigate(action)
            // navCon.navigate(R.id.action_chooseRecipientFragment2_to_specifyAmountFragment)
        }

        binding.button5.setOnClickListener {
            navCon.popBackStack()
        }

    }

}
