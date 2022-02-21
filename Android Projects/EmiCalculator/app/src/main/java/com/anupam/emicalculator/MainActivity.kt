package com.anupam.emicalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loan = findViewById<EditText>(R.id.Loan)
        val seekLoan = findViewById<SeekBar>(R.id.seekLoan)
        val interest = findViewById<EditText>(R.id.Interest)
        val seekInterest = findViewById<SeekBar>(R.id.seekInterest)
        val tenure = findViewById<EditText>(R.id.Tenure)
        val seekTenure = findViewById<SeekBar>(R.id.seekTenure)
        val emiResult = findViewById<TextView>(R.id.emiResult)


         results()

        seekLoan.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean,
            ) {
                loan.setText(progress.times(1000).toString())

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        seekInterest.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean,
            ) {
                interest.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        seekTenure.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean,
            ) {
                tenure.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        tenure.addTextChangedListener {
            results()
        }

        interest.addTextChangedListener {
            results()
        }

        loan.addTextChangedListener {
            results()
        }

    }

    @SuppressLint("SetTextI18n")
    private fun results() {
        // findViewById<TextView>(R.id.emiResult).setOnClickListener {
        val txt1 = findViewById<EditText>(R.id.Tenure).text.toString().toDouble()
        val txt2 = findViewById<EditText>(R.id.Interest).text.toString().toDouble()
        val txt3 = findViewById<EditText>(R.id.Loan).text.toString().toDouble()


        val txt = findViewById<TextView>(R.id.emiResult)
        val r: Double = txt2 / (12.00 * 100.00)

        val res: Double = txt3 * r * ((1 + r).pow(txt1) / ((1 + r).pow(txt1) - 1))

        txt.text = "EMI: $res/-"

        //}
    }
}
