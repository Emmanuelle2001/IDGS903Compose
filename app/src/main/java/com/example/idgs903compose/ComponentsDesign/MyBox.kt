package com.example.idgs903compose.ComponentsDesign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyBox(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Emmanuelle",
                color = Color.White
            )
        }
    }
}