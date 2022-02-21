package com.anupam.jetpackapps.archcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.anupam.jetpackapps.R
import com.anupam.jetpackapps.databinding.ActivityDbDemoBinding
import java.util.*


data class Invoice(
    val num: String = "#89565",
    val client: String = "Abc Copr Ltd",
    val amt: Double = 45.6,
    val date: String = "01-09-2021",
)



class DbDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        // val show = com.anupam.jetpackapps.archcomp.Invoice()
        // println(show.date)
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_db_demo)
        val binding = DataBindingUtil.setContentView<ActivityDbDemoBinding>(
            this, R.layout.activity_db_demo)
         binding.nam = Invoice()
        binding.lifecycleOwner = this



    }
}
