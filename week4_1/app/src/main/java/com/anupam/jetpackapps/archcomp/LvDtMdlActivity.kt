package com.anupam.jetpackapps.archcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.anupam.jetpackapps.R
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.anupam.jetpackapps.databinding.ActivityLvDtMdlBinding

class LvDtMdlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_lv_dt_mdl)

        val binding : ActivityLvDtMdlBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_lv_dt_mdl
        )

        val viewModel : LvDtVmViewModel by viewModels()
        binding.vm = viewModel
        binding.lifecycleOwner = this

        viewModel.prg.observe(this) {
            Log.i("@anu", it)
        }


//         val lvDt : MutableLiveData<String> = MutableLiveData("once")
//
//        lvDt.value = "xyz"
//
//        lvDt.observe(this) {
//
//        }

        var at = 10
        fun abc(vt: Int) {
            at = 20
        }
    }
}