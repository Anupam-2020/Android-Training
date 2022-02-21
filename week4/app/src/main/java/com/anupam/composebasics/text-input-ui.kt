package com.anupam.composebasics

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class InputDemo {
    companion object{ //  if we create companion object here then we don't need to call function in mainActivity by creating variable.


        @Composable
        fun NormalInput() {

            var text by remember { mutableStateOf("")} // Data related.

            TextField(value = text, onValueChange = { text = it }, // UI related.
            label = { Text("Label")},
            modifier = Modifier.padding(top = 10.dp)
            )
        }
    }
}
