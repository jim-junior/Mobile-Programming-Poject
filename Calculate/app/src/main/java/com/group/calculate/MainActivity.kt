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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
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
                    modifier = Modifier
                        .fillMaxSize()
                    ,
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
    var res by remember { mutableStateOf(0) }
    var current by remember { mutableStateOf(1) }


    fun calculate() {
        when (oper) {
            "+" -> res = num1.toInt() + num2.toInt()
            "-" -> res = num1.toInt() - num2.toInt()
            "x" -> res = num1.toInt() * num2.toInt()
            "/" -> res = num1.toInt() / num2.toInt()
        }
    }

    fun reset() {
        num1 = ""
        num2 = ""
        oper = "+"
        res = 0
        current = 1
    }

    fun addNumber(number: String) {
        if (current == 1) {
            num1 += number
        } else {
            num2 += number
        }
    }

    fun addOperator(operat: String) {
        oper = operat
        current = 2
    }

    fun addResult() {
        calculate()
        num1 = res.toString()
        num2 = ""
        current = 2
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {

        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(Color.White)
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
                    color = Color.Black
                )
                Text(text = oper,
                    fontSize = 6.em,
                    color = Color.Black)
                Text(text = num2,
                    fontSize = 6.em,
                    color = Color.Black)
            }
            Row (
                modifier = modifier
                    .fillMaxWidth()
                ,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(text = "=",
                    fontSize = 10.em,
                    color = Color.Black)
                Text(text = res.toString(),
                    fontSize = 10.em,
                    color = Color.Black)
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 30.dp,
                    vertical = 10.dp
                )
        ) {

            Button(onClick = { addNumber("1") }) {
                Text(text = "1")
            }

            Button(onClick = { addNumber("2") }) {
                Text(text = "2")
            }

            Button(onClick = { addNumber("3") }) {
                Text(text = "3")
            }

            FilledTonalButton(onClick = { addOperator("x") }) {
                Text(text = "x")
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 30.dp,
                    vertical = 10.dp
                )
        ) {

            Button(onClick = { addNumber("4") }) {
                Text(text = "4")
            }

            Button(onClick = { addNumber("5") }) {
                Text(text = "5")
            }

            Button(onClick = { addNumber("6") }) {
                Text(text = "6")
            }

            FilledTonalButton(onClick = { addOperator("/") }) {
                Text(text = "/")
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 30.dp,
                    vertical = 10.dp
                )
        ) {

            Button(onClick = { addNumber("7") }) {
                Text(text = "7")
            }

            Button(onClick = { addNumber("8") }) {
                Text(text = "8")
            }

            Button(onClick = { addNumber("9") }) {
                Text(text = "9")
            }

            FilledTonalButton(onClick = { addOperator("+") }) {
                Text(text = "+")
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 30.dp,
                    vertical = 10.dp
                )
        ) {

            OutlinedButton(
                onClick = { reset() },
                modifier = modifier,
            ) {
                Text(text = "AC")
            }

            Button(onClick = { addNumber("0") }) {
                Text(text = "0")
            }

            OutlinedButton(
                onClick = { addResult() },
                modifier = modifier
            ) {
                Text(text = "=")
            }

            FilledTonalButton(onClick = { addOperator("-") }) {
                Text(text = "-")
            }


        }



    }

    





}
