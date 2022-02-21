package com.anupam.recsalaryactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.TextUtils.replace
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.anupam.recsalaryactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     val viewModel : SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.vm = viewModel
        binding.lifecycleOwner = this

        viewModel.appData.observe(this) {
            supportFragmentManager.commit {
                replace<RecGrdFragment>(R.id.fragmentContainerView)
            }
        }

        // traditionalWayOfPassingData1()
    }

//    private fun traditionalWayOfPassingData() {
//
//        supportFragmentManager.commit {
//            val frag = TraditionalFragment()
//            val bundle = Bundle()
//            bundle.putString("dfs", "red")
//            bundle.putString("zmxnvxcmjtdsusfy", "#ff0000")
//            frag.arguments = bundle
//            replace(R.id.fragmentContainerView, frag)
//        }
//    }

    private fun traditionalWayOfPassingData1() {

        supportFragmentManager.commit {
            replace(
                R.id.fragmentContainerView,
                TraditionalFragment.newInstance("green", "#00ff00")
            )
        }
    }

}


