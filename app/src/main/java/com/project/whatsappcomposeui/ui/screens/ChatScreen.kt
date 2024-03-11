package com.project.whatsappcomposeui.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.whatsappcomposeui.data.chatList
import com.project.whatsappcomposeui.domain.Chat
import com.project.whatsappcomposeui.ui.components.UserDetails
import com.project.whatsappcomposeui.ui.components.UserImage
import com.project.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme

@Composable
fun ChatScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        items(chatList){
            ChatItem(chat = it)
        }
    }
}

@Composable
fun ChatItem(chat: Chat) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp)) {
        UserImage(userImage = chat.userImage)
        UserDetails(chat)
    }
}

@Preview(showBackground = true)
@Composable
private fun ChatScreenPreview() {
    WhatsAppComposeUITheme {
        ChatScreen()
    }
}