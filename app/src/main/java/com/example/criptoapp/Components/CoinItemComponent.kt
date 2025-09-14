package com.example.criptoapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.criptoapp.Items.CriptoCoinItem
import coil.compose.AsyncImage
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape


@Composable
fun CoinItemComponent(coin: CriptoCoinItem, number: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFF151B2E))
            .padding(top = 15.dp,  start = 5.dp, end = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "$number",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )

        AsyncImage(
            model = coin.image,
            contentDescription = coin.Name,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
        )

        Text(
            text = coin.Name,
            modifier = Modifier.weight(3f),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )

        Text(
            text = coin.Price,
            modifier = Modifier.weight(2f),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )
    }
}