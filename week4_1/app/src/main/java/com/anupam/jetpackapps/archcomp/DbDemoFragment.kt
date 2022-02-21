package com.anupam.jetpackapps.archcomp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Switch
import androidx.databinding.DataBindingUtil
import com.anupam.jetpackapps.R
import com.anupam.jetpackapps.databinding.FragmentDbDemoBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.chip.ChipGroup
import java.util.*

class Dt {
    val v = Date()
}

class DbDemoFragment : Fragment() {

    private lateinit var binding: FragmentDbDemoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding =  DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_db_demo,
            container,
            false
        )

        binding.swNm = "Android"

//        binding.chkLsnr = CompoundButton.OnCheckedChangeListener{
//            button, isChecked ->  Log.i("@anu","${isChecked}")
//        }

        binding.inv = Date().toString()

        binding.swSt = false


        binding.setChkLsnr{ buttonView, isChecked -> Log.i("@anu", "${isChecked}")}

        binding.chkLsnr = CompoundButton.OnCheckedChangeListener {
                _, isChecked -> Log.i("@anu", "$isChecked") }


        return binding.root
    }
}
