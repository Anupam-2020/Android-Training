package com.anupam.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.anupam.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val friends = listOf<Friend>(
            Friend("anupam","678", "@abc"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn")

        )
        setContent {
//            Text(text = "Welcome To JetPack Compose")
//            SimpleText() // both text as well as SimpleText will overlap if both are run at same times.

//            Column {
//                Text(text = "hello World")
//                Text(text = "Hi") // To get rid of overlapping thing we can  use column and row methods and put the
//                                  // texts inside that method.
//            }

            // andr()

//            val d =  Demo()
//            d.ModifierDemo()
            // InputDemo.NormalInput()
            // Calculator()
            // OptimizedCalculator()
//            FriendList(friends = friends)

            Calculator()
        }
    }
}


//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeBasicsTheme {
//        Greeting("Android")
//    }
//}


@Preview(showBackground = true)
@Composable
fun AppPreView() {
    // Calculator()
    // OptimizedCalculator()
    val friends = listOf<Friend>()
    FriendList(friends = friends)
}


