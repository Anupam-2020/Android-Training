package com.anupam.recsalaryactivity.oldnav

import android.os.Bundle
import android.os.IBinder
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anupam.recsalaryactivity.R
import com.anupam.recsalaryactivity.databinding.FragmentChooseRecipientBinding


class ChooseRecipientFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentChooseRecipientBinding.inflate(
            inflater,
            container,
            false
        )

        binding.button4.setOnClickListener { requireActivity().onBackPressed()  }
        binding.button3.setOnClickListener {
            (requireActivity() as OldNavActivity).loadFragment(
                SpecifyAmountFragment.newInstance(
                    binding.editTextTextPersonName2.text.toString()
                )
            )
        }

        return binding.root
    }

    companion object {

        fun newInstance(recipient: String) = SpecifyAmountFragment()
    }
}