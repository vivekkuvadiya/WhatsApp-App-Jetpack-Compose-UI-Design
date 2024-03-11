package com.project.whatsappcomposeui.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.project.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme

@Composable
fun TextComponents(
    modifier: Modifier = Modifier,
    text: String,
    size: TextUnit = 20.sp,
    color: Color = MaterialTheme.colorScheme.surfaceTint,
    fontWeight: FontWeight = FontWeight.Normal,
    align: TextAlign = TextAlign.Unspecified
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            fontSize = size,
            fontWeight = fontWeight,
            color = color,
            textAlign = align
        )
    )
}

@Preview
@Composable
private fun TextComponentsPreview() {
    WhatsAppComposeUITheme {
        TextComponents(text = "Text")
    }
}