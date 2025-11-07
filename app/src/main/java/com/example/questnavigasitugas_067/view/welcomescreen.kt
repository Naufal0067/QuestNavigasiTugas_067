package com.example.questnavigasitugas_067.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_067.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreen(
    onSubmitClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Welcome") },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color(0xFF008577),
                    titleContentColor = Color.White
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Selamat Datang",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(60.dp))

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(60.dp))

            Text(
                text = "Naufal Khalifanny Andriyanto",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "2023014067",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(25.dp))

            Button(
                onClick = onSubmitClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Submit")
            }
        }
    }
}