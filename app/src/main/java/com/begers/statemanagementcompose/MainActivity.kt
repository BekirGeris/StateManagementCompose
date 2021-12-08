package com.begers.statemanagementcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

            var myString = "Android Compose"

            TextField(value = TextFieldValue(text = myString),
                onValueChange = {
                    myString = it.text
                    println(myString)
                })

            var textString = "Hello"

            Spacer(modifier = Modifier.padding(7.dp))

            Text(text = textString,
            fontSize = 26.sp)
            
            Spacer(modifier = Modifier.padding(7.dp))
            
            Button(onClick = {
                println(textString)
                textString = "Merhaba"
            }) {
                Text(text = "Butoon")
                Text(text = "Test")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.images),
                contentDescription = null,
                modifier = Modifier.padding(5.dp))

            Spacer(modifier = Modifier.padding(7.dp))

            Image(painter = ColorPainter(Color.DarkGray),
                contentDescription = null,
                modifier = Modifier.size(20.dp, 20.dp))

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}