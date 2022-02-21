package com.anupam.jetpacknavigationgraph.hammn.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.anupam.jetpacknavigationgraph.R
import com.anupam.jetpacknavigationgraph.databinding.FragmentGalleryBinding

// import com.anupam.jetpacknavigationgraph.hammn.R
// import com.anupam.jetpacknavigationgraph.hammn.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private val args: GalleryFragmentArgs by navArgs()

    private val galleryViewModel: GalleryViewModel by viewModels()

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        _binding?.vm = galleryViewModel

        val cond = if (args.blb) ContextCompat.getDrawable(
            requireContext(),
            R.drawable.ic_light_bulb_or_idea_flat_icon_vector
        )!! else ContextCompat.getDrawable(
            requireContext(),
            R.drawable.ic_light_bulb_off
        )!!
        galleryViewModel.setData(args.from, cond)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
