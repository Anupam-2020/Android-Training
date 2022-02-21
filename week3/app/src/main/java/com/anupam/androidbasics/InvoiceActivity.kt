package com.anupam.androidbasics

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

data class InvoiceItem(
    val item: String,
    val qty: Int,
    val price: Double
)

class InvoiceActivity : AppCompatActivity() {

    private val invoices = ArrayList<InvoiceItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoice)

        populateInvoiceHeader()

        populateInvoiceItemDetails()
    }

    @SuppressLint("SetTextI18n")
    private fun populateInvoiceHeader() {
        findViewById<TextView>(R.id.txtInvNum).text = "#${Random(233).nextInt()}"
        findViewById<TextView>(R.id.txtClNm).text = "Abc Pvt Ltd"
        findViewById<TextView>(R.id.txtClAddr).text = "#122, abc street, pqr road"

        val cal = Calendar.getInstance()
        findViewById<TextView>(R.id.txtInvDt).text = "${cal.get(Calendar.DATE)}/${cal.get(Calendar.MONTH) + 1}/${cal.get(Calendar.YEAR)}"
        findViewById<TextView>(R.id.txtInvAmt).text = "INR. 20317"
    }

    private fun populateInvoiceItemDetails() {
        findViewById<Button>(R.id.btnGenerate).setOnClickListener{
            val invoiceItem = InvoiceItem(
                findViewById<EditText>(R.id.etInvItem).text.toString(),
                findViewById<EditText>(R.id.etInvQty).text.toString().toInt(),
                findViewById<EditText>(R.id.etInvPrice).text.toString().toDouble()
            )

            invoices.add(invoiceItem)
            findViewById<TextView>(R.id.txtInvInfo).append("\n")
            findViewById<TextView>(R.id.txtInvInfo).append(invoiceItem.toString())
            findViewById<TextView>(R.id.txtInvAmt).text = invoices.sumOf { it.price * it.qty }.toString()

            clearInvoiceItemDetails()
        }

    }

    private fun clearInvoiceItemDetails() {
        findViewById<EditText>(R.id.etInvItem).setText("")
        findViewById<EditText>(R.id.etInvQty).setText("")
        findViewById<EditText>(R.id.etInvPrice).setText("")
    }


}


