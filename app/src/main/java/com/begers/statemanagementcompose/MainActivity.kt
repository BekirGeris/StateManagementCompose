package com.begers.statemanagementcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.begers.statemanagementcompose.ui.theme.StateManagementComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            
            Text(text = "Hello",
            fontSize = 26.sp)
            
            Spacer(modifier = Modifier.padding(7.dp))
            
            Button(onClick = {
                println("clicked")
            }) {
                Text(text = "Butoon")
                Text(text = "Test")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}