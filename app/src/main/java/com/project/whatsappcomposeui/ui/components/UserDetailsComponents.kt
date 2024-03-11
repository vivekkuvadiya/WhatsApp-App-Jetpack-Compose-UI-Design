package com.project.whatsappcomposeui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.whatsappcomposeui.data.chatList
import com.project.whatsappcomposeui.domain.Chat
import com.project.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme

@Composable
fun UserDetails(chat: Chat) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            TextComponents(
                modifier = Modifier.weight(1f),
                text = chat.userName,
                size = 18.sp,
                color = MaterialTheme.colorScheme.onSecondary,
                fontWeight = FontWeight.SemiBold
            )
            TextComponents(
                text = chat.message.timeStamp,
                size = 12.sp,
                color = if (chat.message.unreadCount != null) MaterialTheme.colorScheme.secondaryContainer else Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            TextComponents(
                modifier = Modifier.weight(1f),
                text = chat.message.content,
                size = 16.sp,
                color = Color.Gray
            )
            chat.message.unreadCount?.let {
                TextComponents(
                    modifier = Modifier
                        .padding(4.dp)
                        .size(16.dp)
                        .background(
                            MaterialTheme.colorScheme.secondaryContainer,
                            CircleShape
                        ),
                    text = it.toString(),
                    size = 12.sp,
                    color = MaterialTheme.colorScheme.surfaceTint,
                    align = TextAlign.Center
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UserDetailsPreview() {
    WhatsAppComposeUITheme {
        UserDetails(chat = chatList[0])
    }
}