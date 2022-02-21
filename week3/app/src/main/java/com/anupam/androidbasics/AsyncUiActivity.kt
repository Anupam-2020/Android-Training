package com.anupam.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView
import kotlinx.coroutines.*

class AsyncUiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_ui)

        val txtCnt = findViewById<TextView>(R.id.txtCnt)

        usingCustomScope(txtCnt)

    }
        private fun usingCustomScope(txt: TextView) {
            val scp = CoroutineScope(Job() + Dispatchers.IO)
            scp.launch{(60 downTo 1).map {
                delay(1000)
                runOnUiThread {
                    txt.text = "$it"
                }
            }
        }
    }
}
