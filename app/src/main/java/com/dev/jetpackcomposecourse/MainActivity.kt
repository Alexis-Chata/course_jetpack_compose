package com.dev.jetpackcomposecourse

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.jetpackcomposecourse.ui.theme.JetpackcomposecourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposecourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

                        //Greeting("Android")
                        //MyBox()
                        //MyColumn()
                        //MyRow()
                        //MyCombinandoLayout()
                        //MyStateExample()
                        MyText()
                        MyTextFieldAdvance()
                        MyTextFieldOutlined()
                        MyButtonExample()
                        MyImage()
                        MyImageAdvance()
                        MyIcon()
                        MyProgress()
                        MyProgressAdvance()
                        MyCard()
                        MyBadgeBox()
                        MyDivider()
                        MySwitch()
                        MyCheckBox()
                        MyCheckBoxWithText()
                        MyCheckBoxWithTextCompletedPreview()
                        MyTriStatusCheckBox()
                        MyRadioButtonListPreview()
                        MyRadioButton()
                        MyDropDownMenu()
                        BasicSlider()
                        AdvanceSlider()
                        MyRangeSlider()

                        var show1 by rememberSaveable {
                            mutableStateOf(false)
                        }
                        Button(onClick = { show1 = true }) {
                            Text(text = "Mostrar dialogo 1")
                        }
                        MyAlertDialog(show = show1,
                            onDismiss = { show1 = false },
                            onConfirm = { Log.i("aris", "click") })

                        var show2 by rememberSaveable {
                            mutableStateOf(false)
                        }
                        Button(onClick = { show2 = true }) {
                            Text(text = "Mostrar dialogo 2")
                        }
                        MySimpleCustomDialog(show = show2, onDismiss = { show2 = false })

                        var show3 by rememberSaveable {
                            mutableStateOf(false)
                        }
                        Button(onClick = { show3 = true }) {
                            Text(text = "Mostrar dialogo 3")
                        }
                        MyCustomDialog(show = show3, onDismiss = { show3 = false })

                        var show4 by rememberSaveable {
                            mutableStateOf(false)
                        }
                        Button(onClick = { show4 = true }) {
                            Text(text = "Mostrar dialogo 4")
                        }
                        MyConfirmationDialog(show = show4, onDismiss = { show4 = false })
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackcomposecourseTheme {
        Greeting("Android")
    }
}

// LAYOUTS JETPACK COMPOSE

// BOX SERIA COMO UN FRAME DE LOS ANTIGUOS LAYOUTS DE XML
@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(Color.Cyan)
                .verticalScroll(rememberScrollState()), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Esto es un Ejemplo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyBoxPreview() {
    JetpackcomposecourseTheme {
        MyBox()
    }
}


// COLUMN SERIA COMO UN LINEAR LAYOUT EN POSICION VERTICAL
@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "ejemplo 1",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(300.dp)
        )
        Text(
            text = "ejemplo 2",
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .height(300.dp)
        )
        Text(
            text = "ejemplo 3",
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(300.dp)
        )
        Text(
            text = "ejemplo 4",
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(300.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyColumnPreview() {
    JetpackcomposecourseTheme {
        MyColumn()
    }
}


// ROW SERIA COMO UN LINEAR LAYOUT EN POSICION HORIZONTAL
@Composable
fun MyRow() {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "ejemplo 1",
            modifier = Modifier
                .background(Color.Red)
                .width(300.dp)
                .height(300.dp)
        )
        Text(
            text = "ejemplo 2",
            modifier = Modifier
                .background(Color.Black)
                .width(300.dp)
                .height(300.dp)
        )
        Text(
            text = "ejemplo 3",
            modifier = Modifier
                .background(Color.Cyan)
                .width(300.dp)
                .height(300.dp)
        )
        Text(
            text = "ejemplo 4",
            modifier = Modifier
                .background(Color.Blue)
                .width(300.dp)
                .height(300.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyRowPreview() {
    JetpackcomposecourseTheme {
        MyRow()
    }
}


// COMBINANDO LAYOUTS
@Composable
fun MyCombinandoLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        MySpacer(10)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }
        MySpacer(30)
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Blue),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}

@Preview
@Composable
fun MyCombinandoLayoutPreview() {
    MyCombinandoLayout()
}

// COMPONENT SPACER SIRVE PARA DAR UNA SEPARACION O ESPACIO
@Composable
fun MySpacer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}

@Preview
@Composable
fun MyStateExample() {
    var counter by rememberSaveable { mutableStateOf(0) }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado $counter veces")
    }
}