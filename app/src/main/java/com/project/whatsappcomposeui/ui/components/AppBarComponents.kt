package com.project.whatsappcomposeui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.whatsappcomposeui.R
import com.project.whatsappcomposeui.ui.theme.Gray
import com.project.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme
import com.project.whatsappcomposeui.ui.theme.White

@Composable
fun AppBarComponents() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.whatsapp),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = if (isSystemInDarkTheme()) Gray else White
            )
        )

        Spacer(modifier = Modifier.weight(1f))
        
        Icon(painter = painterResource(id = R.drawable.ic_camera), contentDescription = "camera", tint = MaterialTheme.colorScheme.surfaceTint)

        Spacer(modifier = Modifier.width(20.dp))

        Icon(imageVector = Icons.Filled.Search, contentDescription = "search", tint = MaterialTheme.colorScheme.surfaceTint)

        Spacer(modifier = Modifier.width(20.dp))

        Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "more", tint = MaterialTheme.colorScheme.surfaceTint)
    }
}

@Preview
@Composable
private fun AppBarComponentsPreview() {
    WhatsAppComposeUITheme {
        AppBarComponents()
    }
}