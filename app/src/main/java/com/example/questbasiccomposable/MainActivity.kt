package com.example.questbasiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable.ui.theme.QuestBasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}
@Composable
fun BasicColumn(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Login Text
        Text(
            text = "Login",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(3.dp))
        Text(
            text = "Ini adalah halaman login",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(40.dp))

        // UMY Logo
        Image(
            painter = painterResource(id = R.drawable.logo), // Make sure this image exists
            contentDescription = "Logo UMY",
            modifier = Modifier.size(250.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))

        // Nama Text
        Text(
            text = "Nama",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = "Dina Amalia",  // Replace with your name if needed
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(5.dp))

        // NIM Text
        Text(
            text = "20220140179",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(id = R.drawable.dina),
            contentDescription = "",
            modifier = Modifier
                .size(350.dp)
                .offset(y = 25.dp)
                .clip(CircleShape)
        )
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
        fun BasicColumnPreview() {
            QuestBasicComposableTheme {
                BasicColumn()
            }
        }

