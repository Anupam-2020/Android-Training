package com.anupam.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //resource.folder.file_name
        //resource = R, folder = drawable, file_name = ic_launcher_background
//        R.drawable.ic_launcher_background
//        R.mipmap.ic_launcher

        setContentView(R.layout.activity_main) // it parses xml and creates objects for widgets ans store it in memory

        val i: Int = 10
        val txVw: TextView = findViewById(R.id.txVw)

        val j = 110
        val btOk = findViewById<Button>(R.id.btOk)
        btOk.setOnClickListener {
            txVw.text = "Welcome to Android Programming"
        }
    }
}
