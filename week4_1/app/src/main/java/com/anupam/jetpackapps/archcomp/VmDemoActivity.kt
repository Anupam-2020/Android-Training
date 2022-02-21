package com.anupam.jetpackapps.archcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.anupam.jetpackapps.R
import com.anupam.jetpackapps.databinding.ActivityEmiCalcBinding
import com.anupam.jetpackapps.databinding.ActivityVmDemoBinding
import java.util.*

class VmDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_vm_demo)

        // the below code replaces the findViewById.
        val binding = ActivityVmDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var isVs = false
        binding.btDtNw.setOnClickListener {
            binding.txtDtNw.text = Date().toString()
            // binding.progressBar2.setVisibility(View.INVISIBLE)
            binding.progressBar2.visibility = if(isVs) View.INVISIBLE else View.VISIBLE
            isVs = isVs.not()
        }
    }
}
