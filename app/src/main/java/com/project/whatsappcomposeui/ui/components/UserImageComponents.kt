package com.project.whatsappcomposeui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun UserImage(userImage: String) {
    Image(
        painter = rememberAsyncImagePainter(userImage), contentDescription = "userImage",
        modifier = Modifier.size(55.dp).padding(2.dp).clip(CircleShape)
    )
}

@Preview
@Composable
private fun UserImagePreview() {
    UserImage(userImage = "https://www.gravatar.com/avatar/2c7d99fe281ecd3bcd65ab915bac6dd5?s=250")
}