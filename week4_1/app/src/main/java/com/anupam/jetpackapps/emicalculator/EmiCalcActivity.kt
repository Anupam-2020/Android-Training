package com.anupam.jetpackapps.emicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.anupam.jetpackapps.R
import com.anupam.jetpackapps.databinding.ActivityEmiCalcBinding

class EmiCalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//         setContentView(R.layout.activity_emi_calc)

        val binding = DataBindingUtil.setContentView<ActivityEmiCalcBinding>(
            this,R.layout.activity_emi_calc
        )


        // lifecycleOwner helps in observing changes of LiveData in this binding
        val viewModel : EmiViewModel by viewModels()
        binding.lifecycleOwner = this
        binding.vm = viewModel
    }
}
