package com.example.idgs903compose

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.idgs903compose.ComponentsDesign.MyBox
import com.example.idgs903compose.ComponentsDesign.MyColumn
import com.example.idgs903compose.ComponentsDesign.MyRow
import com.example.idgs903compose.ui.theme.IDGS903ComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            IDGS903ComposeTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    MyRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
    @Composable
    fun Saludo(modifier: Modifier = Modifier) {
        Text("Emmanuelle")
        Text("Hernández")
        Text("Oropeza")
    }

    @Preview(showBackground = true)
    @Composable
    fun SaludoPreview() {
        IDGS903ComposeTheme {
            Saludo(Modifier.fillMaxSize())
        }
    }
}