package com.example.criptoapp

import android.app.Notification
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import com.example.criptoapp.Components.CoinsList
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
fun MainView(modifier: Modifier = Modifier){
    val background = Color(0xFF0B1020)
    val notifications = listOf(
        NotificationItem("Hola les habla el 2009", "$2.99"),
        NotificationItem("Transacción completada", "$5.00"),
        NotificationItem("Nuevo depósito recibido", "$12.75")
    )

    val coins = listOf(
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/btc.png",
            Name = "Bitcoin",
            Price = "$109,797.37"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/eth.png",
            Name = "Ethereum",
            Price = "$4,321.21"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/usdt.png",
            Name = "Tether",
            Price = "$1.0000"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/xrp.png",
            Name = "XRP",
            Price = "$2.8100"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/bnb.png",
            Name = "BNB",
            Price = "$845.0000"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/sol.png",
            Name = "Solana",
            Price = "$201.8500"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/usdc.png",
            Name = "USDC",
            Price = "$0.9998"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/doge.png",
            Name = "Dogecoin",
            Price = "$0.1320"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/trx.png",
            Name = "TRON",
            Price = "$0.0835"
        ),
        CriptoCoinItem(
            image = "https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/ada.png",
            Name = "Cardano",
            Price = "$0.25"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
            .padding(top = 40.dp, start = 10.dp, end = 10.dp)

    ){
        Text(text = "CoinSphere",
            modifier = Modifier
                .padding(bottom = 10.dp),
            style = MaterialTheme.typography.titleLarge,
            color = Color.White,
            fontWeight = FontWeight.Bold
            )
        notifications.forEach { notification ->
            NotificationsBox(notification)
        }

        TagsLine()
        CoinsList(coins)

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CriptoAppTheme {
        MainView()
    }
}