package com.anupam.composenavigation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anupam.composenavigation.R


@Composable
fun Bulb(from: String, blb: Boolean) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .padding(16.dp)
    ) {
        Text(text = from,
            modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 36.sp)
        Image(
            painter = painterResource(
                id = if (blb) R.drawable.ic_light_bulb_or_idea_flat_icon_vector else R.drawable.ic_light_bulb_off),
            contentDescription = from,
            modifier = Modifier
                .weight(0.7f)
                .fillMaxWidth())
    }
}
