package com.example.criptoapp.Components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.criptoapp.Items.NotificationItem

@Composable
fun NotificationsBox(notification: NotificationItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0Xff151B2E))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = notification.message,
                style = MaterialTheme.typography.bodySmall,
                color = Color(0xFF9AA3B2),
                modifier = Modifier
                    .padding(bottom = 5.dp)

            )
            Text(
                text = notification.price,
                style = MaterialTheme.typography.bodyLarge,
                color = Color(0xFFE8ECF8),
                fontWeight = FontWeight.Bold
            )
        }
    }
}