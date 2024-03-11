package com.project.whatsappcomposeui.domain

data class Chat(
    val chatId:Int,
    val message:Message,
    val userName:String,
    val userImage:String
)

data class Message(
    val content:String,
    val deliveryStatus:MessageDeliveryStatus,
    val messageType:MessageType,
    val timeStamp:String,
    val unreadCount:Int? = null
)

enum class MessageDeliveryStatus{
    DELIVERED,
    READ,
    PENDING,
    ERROR
}

enum class MessageType{
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE
}