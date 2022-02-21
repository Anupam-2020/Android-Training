package com.anupam.composenavigation.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ColorPicker(navHostController : NavHostController) {

    var red by remember { mutableStateOf(0f) }
    var green by remember { mutableStateOf(0f) }
    var blue by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp)
    ) {
        Row {
            Column {
                Text(text = "Red : $red")
                Slider(
                    value = red,
                    valueRange = 0f..255f,
                    onValueChange = { red = it }
                )
            }
        }

        Row {
            Column {
                Text(text = "Green : $green")
                Slider(
                    value = green,
                    valueRange = 0f..255f,
                    onValueChange = { green = it }
                )
            }
        }

        Row {
            Column {
                Text(text = "Blue : $blue")
                Slider(
                    value = blue,
                    valueRange = 0f..255f,
                    onValueChange = { blue = it }
                )
            }
        }

        Row {
            Button(onClick = {
                navHostController.navigate("color-presenter/$red/$green/$blue")
            }) {
                Text(text = "Next")
            }
        }
    }
}