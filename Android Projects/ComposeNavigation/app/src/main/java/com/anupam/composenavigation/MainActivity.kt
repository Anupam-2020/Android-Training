package com.anupam.composenavigation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.anupam.composenavigation.composables.AppNavHost
import com.anupam.composenavigation.composables.ColorPicker
import com.anupam.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "etge5" ) {
//                //composable("profile") { Profile(navController) }
//                //composable("greetings") { Greeting("Hello") }
//                composable(route = "grt/{msg}",
//                arguments = listOf(
//                    navArgument("msg") { type = NavType.StringType }
//                )
//                ) {
//                    val msg = it.arguments?.getString("msg") ?: ""
//                    Greeting(name = msg)
//                }
//                composable("etge5") { Profile(navCon = navController)}
//            }


            // Greeting(name = "Android")


            // AppNavHost(navController)
            ColorPicker(navController)

        }
    }
}

@Composable
fun Profile(navCon : NavController) {
    Column {
        Button(onClick = { navCon.navigate("grt/greetings")  }) {
            Text(text = "Greetings")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
