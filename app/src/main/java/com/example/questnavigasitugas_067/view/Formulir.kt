package com.example.questnavigasitugas_067.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_067.R

@Composable
fun FormDataDiri(
    modifier: Modifier = Modifier.fillMaxSize(),
    onSubmit: () -> Unit
) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatusKawin by remember { mutableStateOf("") }

    val genderOptions = listOf(
        stringResource(R.string.jk_laki_laki),
        stringResource(R.string.jk_perempuan)
    )

    val statusKawinOptions = listOf(
        stringResource(R.string.sk_janda),
        stringResource(R.string.sk_lajang),
        stringResource(R.string.sk_duda)
    )

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFD0BCFF),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(
                        text = stringResource(R.string.label_form_title),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    )
}