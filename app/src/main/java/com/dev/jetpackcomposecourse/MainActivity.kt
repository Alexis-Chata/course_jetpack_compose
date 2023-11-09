package com.dev.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Greeting("Android")
                    //MyBox()
                    //MyColumn()
                    //MyRow()
                    MyCombinandoLayout()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
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
fun MyColumn(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "ejemplo 1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(300.dp))
        Text(text = "ejemplo 2", modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .height(300.dp))
        Text(text = "ejemplo 3", modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .height(300.dp))
        Text(text = "ejemplo 4", modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .height(300.dp))
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
            .horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "ejemplo 1", modifier = Modifier
                .background(Color.Red)
                .width(300.dp)
                .height(300.dp)
        )
        Text(
            text = "ejemplo 2", modifier = Modifier
                .background(Color.Black)
                .width(300.dp)
                .height(300.dp)
        )
        Text(
            text = "ejemplo 3", modifier = Modifier
                .background(Color.Cyan)
                .width(300.dp)
                .height(300.dp)
        )
        Text(
            text = "ejemplo 4", modifier = Modifier
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
                .background(Color.Cyan)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red)) {

            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "hola")
            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Blue)
        ) {

        }
    }
}

@Preview
@Composable
fun MyCombinandoLayoutPreview() {
    MyCombinandoLayout()
}