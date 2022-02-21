package com.anupam.androidbasics

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.widget.doOnTextChanged

class SeekbarActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar)


        watchingTextTraditionalWay()

    }

    private fun seekBarChangeEvents() {
        val seek = findViewById<SeekBar>(R.id.seek)
        val txtSz = findViewById<TextView>(R.id.txtSz)

        seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.i("@anu", "$progress")
                txtSz.textSize = progress.toFloat()

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
    }


    private fun watchingTextKotlinsWay() {
        val txtEdt = findViewById<EditText>(R.id.txtEdt)
        val txtSz = findViewById<TextView>(R.id.txtSz)

        txtEdt.doOnTextChanged { text, start, before, count -> // kotlin's way
            Log.i("@anu", "$text")
            if (text.toString().isEmpty().not())
                txtSz.textSize = text.toString().toFloat()
            else
                txtSz.textSize = 1f
        }
    }

    private fun watchingTextTraditionalWay() {

        val txtSz = findViewById<TextView>(R.id.txtSz)
        val txtEdt = findViewById<EditText>(R.id.txtEdt)

        txtEdt.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) {
                if(text.toString().isEmpty().not())
                    txtSz.textSize = text.toString().toFloat()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
    }
}
