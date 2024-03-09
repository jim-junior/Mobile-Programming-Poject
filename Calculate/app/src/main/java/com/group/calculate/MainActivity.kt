package com.group.calculate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.group.calculate.ui.theme.CalculateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    CalculatorApp()

                }
            }
        }
    }
}

@Preview
@Composable
fun CalculatorApp() {
    CalculatorButtons(
    )
}


@Composable
fun CalculatorButtons(modifier: Modifier = Modifier) {

    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var oper by remember { mutableStateOf("+") }
    var res by remember { mutableStateOf("") }






    Column(
        modifier = modifier
            .fillMaxSize()

    ) {

        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(200.dp)
                .padding(15.dp)
        ) {

            Row (
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = num1,
                    fontSize = 6.em,
                    color = Color.White
                )
                Text(text = oper,
                    fontSize = 6.em,
                    color = Color.White)
                Text(text = num2,
                    fontSize = 6.em,
                    color = Color.White)
            }
            Row (
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(text = "=",
                    fontSize = 10.em,
                    color = Color.White)
                Text(text = res,
                    fontSize = 10.em,
                    color = Color.White)
            }

        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
        ) {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "1")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "2")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "3")
            }

        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
        ) {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "4")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "5")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "6")
            }

        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
        ) {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "7")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "8")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "9")
            }

        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
        ) {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "+")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "0")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "-")
            }

        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
        ) {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "/")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "x")
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = modifier
            ) {
                Text(text = "=")
            }

        }

        Row(
            modifier = modifier
        ) {

            Button(
                onClick = { /*TODO*/ },
                modifier = modifier.fillMaxWidth()
            ) {
                Text(text = "RESET")
            }


        }

    }

}
