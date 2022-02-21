package com.anupam.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityUi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui)
    }
}