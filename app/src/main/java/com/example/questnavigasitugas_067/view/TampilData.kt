package com.example.questnavigasitugas_067.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.questnavigasitugas_067.R

@Composable
fun TampilData(
    onHomeClick: () -> Unit,
    onFormClick: () -> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Naufal"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Laki - Laki"),
        Pair(stringResource(id = R.string.alamat), "Jauh"),
        Pair(stringResource(id = R.string.status_perkawinan), "Lajang")
    )
}