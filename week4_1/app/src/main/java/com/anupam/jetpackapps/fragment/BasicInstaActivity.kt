package com.anupam.jetpackapps.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.commit
import com.anupam.jetpackapps.R
import androidx.fragment.app.replace

class BasicInstaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_insta)

        findViewById<ImageView>(R.id.imgMsg).setOnClickListener {
            supportFragmentManager.commit {
                replace<MessageFragment>(R.id.fragInsta)
            }
        }
        findViewById<ImageView>(R.id.imgSt).setOnClickListener {
                supportFragmentManager.commit {
                    replace<SettingsFragment>(R.id.fragInsta)
                }
        }
        findViewById<ImageView>(R.id.imgPf).setOnClickListener {
                supportFragmentManager.commit {
                    replace<ProfileFragment>(R.id.fragInsta)
                }
        }
    }
}
