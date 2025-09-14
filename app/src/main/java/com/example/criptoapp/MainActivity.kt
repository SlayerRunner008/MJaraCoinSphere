package com.example.criptoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.criptoapp.Components.CoinItemComponent
import com.example.criptoapp.Components.NotificationsBox
import com.example.criptoapp.Components.TagsLine
import com.example.criptoapp.Items.CriptoCoinItem
import com.example.criptoapp.Items.NotificationItem
import com.example.criptoapp.ui.theme.CriptoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CriptoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun MainView(modifier: Modifier = Modifier) {
    val background = Color(0xFF0B1020)

    val notifications = listOf(
        NotificationItem("Global Market Cap", "$2.18T"),
        NotificationItem("Fear & Greed", "Neutral(54)"),
        NotificationItem("Altcoin Season", "No")
    )

    val coins = listOf(
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/btc.png", "Bitcoin", "$109,797.37"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/eth.png", "Ethereum", "$4,321.21"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/usdt.png", "Tether", "$1.0000"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/xrp.png", "XRP", "$2.8100"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/bnb.png", "BNB", "$845.0000"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/sol.png", "Solana", "$201.8500"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/usdc.png", "USDC", "$0.9998"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/doge.png", "Dogecoin", "$0.1320"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/trx.png", "TRON", "$0.0835"),
        CriptoCoinItem("https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/ada.png", "Cardano", "$0.25")
    )

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(top = 40.dp, start = 10.dp, end = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Text(
                text = "CoinSphere",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp)
            )
        }

        items(notifications) { notification ->
            NotificationsBox(notification)
        }

        item {
            TagsLine()
        }

        itemsIndexed(coins) { index, coin ->
            CoinItemComponent(coin = coin, number = index + 1)
        }


    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CriptoAppTheme {
        MainView()
    }
}