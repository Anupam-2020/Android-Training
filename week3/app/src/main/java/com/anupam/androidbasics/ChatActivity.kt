package com.anupam.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

//data class Chat(
//    val type : Int,
//    val message : String,
//    val user : String,
//    val date : String
//)


class ChatActivity : AppCompatActivity() {
    // private lateinit var chats: ArrayList<Chat> // initialization can be made afterwards.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)


        val llChats = findViewById<LinearLayout>(R.id.llchats)
        val et = findViewById<EditText>(R.id.etCht)

//        findViewById<TextView>(R.id.btSnd).setOnClickListener {
//            llChats.addView(
//                TextView(this).apply {
//                    text = et.text.toString()
//                    textSize = 24f
//                }
//            )
//        }
          // demoChats()
          leftRightChatBubbles()
    }

    private fun leftRightChatBubbles() {
        val llchats = findViewById<LinearLayout>(R.id.llchats)
        val et = findViewById<EditText>(R.id.etCht)
        val inflater = LayoutInflater.from(this)

        val vwRt = inflater.inflate(R.layout.chat_item_right, llchats, false)
        vwRt.findViewById<TextView>(R.id.txRtUser).text = "abc"
        vwRt.findViewById<TextView>(R.id.txRtTm).text = "5:00 pm"
        vwRt.findViewById<TextView>(R.id.txRtMsg).text = "This is right msg"
        llchats.addView(vwRt)

        val vwLt = inflater.inflate(R.layout.chat_item, llchats, false)
        vwLt.findViewById<TextView>(R.id.txLtUser).text = "abc"
        vwLt.findViewById<TextView>(R.id.txLtTm).text = "5:00 pm"
        vwLt.findViewById<TextView>(R.id.txLtMsg).text = "This is left msg"
        llchats.addView(vwLt)

        demoChats()

    }
    private fun demoChats() {
        val llChats = findViewById<LinearLayout>(R.id.llchats)
        val et = findViewById<EditText>(R.id.etCht)
//        val ctx: Context = this // this points to current object of ChatActivity
//        val ctx1: Context = ChatActivity()
//        for (i in 0..100) {
//            val cht = TextView(this)
//             cht.text =  "Hello World --> $i"
//        }
        findViewById<TextView>(R.id.btSnd).setOnClickListener {
            llChats.addView(
                TextView(this).apply {
                    text = et.text.toString()
                    textSize = 24f
                }
            )
        }

    }
}
