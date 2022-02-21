package com.anupam.composebasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


class Demo() {
    // companion object {
        @Composable
        fun SimpleText() {
            Text(text = "Welcome to Jetpack Compose")
        }

        @Composable
        fun andr() {
            Column {
                for (i in 1..10) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.ic_android_black_24dp),
                            contentDescription = "Android Icon"
                        )
                        Text(
                            text = "hello World"
                        )
                        Text(text = " Hi")
                    }
                }
            }
        }

        @Composable
        fun ModifierDemo() {
            Text(text = "Hello",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(10.dp)
                    .border(2.dp, Color.Black)
                    .fillMaxWidth() // similar to match parent.
                    .fillMaxHeight()
            )
        }
    //}
}
