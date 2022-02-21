package com.anupam.jetpackapps.emicalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.anupam.jetpackapps.R
import com.anupam.jetpackapps.databinding.FragmentEmiWidgetBinding

class EmiWidgetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel : EmiViewModel by activityViewModels()

        val binding = DataBindingUtil.inflate<FragmentEmiWidgetBinding>(
            inflater,
            R.layout.fragment_emi_widget,
            container,
            false
        )
        binding.lifecycleOwner = this

        binding.vm = viewModel

        binding.frag = getFragmentType()
        binding.hnt = hint()


        return binding.root
    }

    private fun getFragmentType() = when(id) {
        R.id.fragmentContainerView4 -> "P"
        R.id.fragmentContainerView6 -> "R"
        else -> "N"
    }

    private fun hint() = when(id) {
        R.id.fragmentContainerView4 -> "Principle"
        R.id.fragmentContainerView6 -> "Rate"
        else -> "Period"
    }

}
