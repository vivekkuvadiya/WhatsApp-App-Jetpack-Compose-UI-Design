package com.project.whatsappcomposeui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.project.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme

@Composable
fun StatusScreen() {
    Column(modifier = Modifier.fillMaxSize()) {

    }
}

@Preview
@Composable
private fun StatusScreenPreview() {
    WhatsAppComposeUITheme {
        StatusScreen()
    }
}