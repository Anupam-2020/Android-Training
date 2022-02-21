package com.anupam.jetpackapps.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.replace
import com.anupam.jetpackapps.R
import androidx.fragment.app.commit

class BestFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_fragment)

        supportFragmentManager.commit {
            replace<OneFragment>(R.id.fragConst2)
        }
    }
}
