package com.example.questnavigasitugas_067.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.tampil),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R.color.teal_700)
                )
            )
        }
    )
}