package com.example.questnavigasitugas_067.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
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
}