package com.project.whatsappcomposeui.data

data class TabData(
    val title:String,
    val unreadCount:Int? = null
)

val tabs = listOf(
    TabData(Tabs.CHATS.value,3),
    TabData(Tabs.STATUS.value),
    TabData(Tabs.CALLS.value)
)

enum class Tabs(val value:String){
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}