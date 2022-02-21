package com.anupam.recsalaryactivity.oldnav

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anupam.recsalaryactivity.R
import com.anupam.recsalaryactivity.databinding.FragmentConfirmationBinding


class ConfirmationFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requireActivity().title = "Payment Confirmation"
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val binding =  FragmentConfirmationBinding.inflate(
            inflater,
            container,
            false
        )


        binding.textView6.text = """
            You have sent INR.${arguments?.getInt(KEY_AMOUNT)} to
            ${arguments?.getString(SpecifyAmountFragment.KEY_RECIPIENT)}
        """.trimIndent()

        binding.textView7.setOnClickListener {


        }

        return binding.root
    }


companion object {

    const val KEY_AMOUNT = "amount"
    fun newInstance(recipient : String, amount : Int) = ConfirmationFragment().apply {
        val bundle = Bundle()
        bundle.putString(SpecifyAmountFragment.KEY_RECIPIENT, recipient)
        bundle.putInt(KEY_AMOUNT, amount)
        arguments = bundle
    }
    }
}
