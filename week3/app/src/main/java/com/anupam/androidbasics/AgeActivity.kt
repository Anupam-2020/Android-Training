package com.anupam.androidbasics

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import android.widget.DatePicker
import android.widget.TextView
import androidx.core.view.get
import java.util.*

class AgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)

         agePrediction()
    }

    @SuppressLint("SetTextI18n")
    private fun agePrediction() {
        val calendar = findViewById<CalendarView>(R.id.calendarView)
        val txtAg = findViewById<TextView>(R.id.txtAg)
        calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
            Log.i("@anu","Selected Date is $dayOfMonth $month $year")

            val calObj = Calendar.getInstance()
            calObj.set(year, month, dayOfMonth)
            val selectedMillis = calObj.timeInMillis
            val currentMillis = System.currentTimeMillis()
            val diff = currentMillis - selectedMillis
            val seconds = diff / 1000
            val minutes = seconds / 60
            val hours = minutes / 60
            val days = hours / 24
            val years = days / 365

            txtAg.text = "Age : $years years"
            Log.i("@anu,","Years ${years}")
        }

    }
}
