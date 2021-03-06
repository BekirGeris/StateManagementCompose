package com.begers.statemanagementcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun OtherScreen() {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            val myString = remember {
                mutableStateOf("Android Compose")
            }
            val myInt = mutableStateOf(5)

            TextField(
                value = myString.value,
                onValueChange = {
                    myString.value = it
                    println(myString.value)
                })

            var textString = remember {
                mutableStateOf("Hello")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Text(
                text = textString.value,
                fontSize = 26.sp)

            Spacer(modifier = Modifier.padding(7.dp))

            Button(
                onClick = {
                    println(textString)
                    textString.value = "Merhaba"
                }) {
                Text(text = "Butoon")
                Text(text = "Test")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Image(
                bitmap = ImageBitmap.imageResource(id = R.drawable.images),
                contentDescription = null,
                modifier = Modifier.padding(5.dp))

            Spacer(modifier = Modifier.padding(7.dp))

            Image(
                painter = ColorPainter(Color.DarkGray),
                contentDescription = null,
                modifier = Modifier.size(20.dp, 20.dp))

        }
    }

}