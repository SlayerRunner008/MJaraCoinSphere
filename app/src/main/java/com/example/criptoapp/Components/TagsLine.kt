package com.example.criptoapp.Components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TagsLine() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {
        Text(
            text = "#",
            modifier = Modifier.padding(end = 5.dp),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )
        Text(
            text = "Name",
            modifier = Modifier.weight(2f),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )
        Text(
            text = "Price",
            modifier = Modifier.weight(1f),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
            )
    }
}