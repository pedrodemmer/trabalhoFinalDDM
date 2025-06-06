package com.example.trabalhofinal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    onLogout: () -> Unit,
    onNavigateToRegisterTrip: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { onNavigateToRegisterTrip() }) {
            Text(text = "Cadastrar Viagem")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onLogout() }) {
            Text(text = "Sair")
        }
    }
}
