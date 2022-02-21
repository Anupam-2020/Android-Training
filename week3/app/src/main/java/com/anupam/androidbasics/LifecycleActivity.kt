package com.anupam.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        Log.i("anu", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("anu", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("anu", "onResume")
    }

    override fun onPause() {
        Log.i("anu", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("anu", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("anu", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i("anu", "onRestart")
        super.onRestart()
    }

}