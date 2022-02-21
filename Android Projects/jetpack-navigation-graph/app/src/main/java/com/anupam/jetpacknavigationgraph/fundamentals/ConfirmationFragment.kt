package com.anupam.jetpacknavigationgraph.fundamentals


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.anupam.jetpacknavigationgraph.R
import com.anupam.jetpacknavigationgraph.databinding.FragmentConfirmationBinding


class ConfirmationFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

      private val args : ConfirmationFragmentArgs by navArgs()

    private lateinit var binding: FragmentConfirmationBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentConfirmationBinding.inflate(
            inflater,
            container,
            false
        )

          binding.textView3.text = "You have sent INR.${args.amt} to ${args.nm}"

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCon = findNavController()

        binding.textView3.setOnClickListener {
            navCon.popBackStack(R.id.mainFragment,false)
        }

    }

}