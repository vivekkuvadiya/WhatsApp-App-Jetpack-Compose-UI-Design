package com.project.whatsappcomposeui.data

import com.project.whatsappcomposeui.domain.Chat
import com.project.whatsappcomposeui.domain.Message
import com.project.whatsappcomposeui.domain.MessageDeliveryStatus
import com.project.whatsappcomposeui.domain.MessageType

val chatList = listOf(
    Chat(
        chatId = 1,
        message = Message(
            content = "...",
            timeStamp = "12/02/2024",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 5
        ),
        userName = "Alex",
        userImage = "https://www.gravatar.com/avatar/2c7d99fe281ecd3bcd65ab915bac6dd5?s=250"
    ),
    Chat(
        chatId = 2,
        message = Message(
            content = "Hi there!",
            timeStamp = "11:15 AM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "John",
        userImage = "https://i.pravatar.cc/250?u=mail@ashallendesign.co.uk"
    ),
    Chat(
        chatId = 3,
        message = Message(
            content = "Hey Alex!",
            timeStamp = "12/02/2024",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userName = "Sarah",
        userImage = "https://example.com/david_image.jpg"
    ),
    Chat(
        chatId = 4,
        message = Message(
            content = "Good morning everyone!",
            timeStamp = "12/02/2024",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Emma",
        userImage = "https://avatar.iran.liara.run/public/boy?username=Ash"
    ),
    // Additional chat entries
    Chat(
        chatId = 5,
        message = Message(
            content = "How are you?",
            timeStamp = "02:30 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Michael",
        userImage = "https://api.dicebear.com/7.x/adventurer-neutral/svg?seed=mail@ashallendesign.co.uk"
    ),
    Chat(
        chatId = 6,
        message = Message(
            content = "I'm fine, thanks!",
            timeStamp = "02:35 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = 3
        ),
        userName = "Rachel",
        userImage = "https://robohash.org/mail@ashallendesign.co.uk"
    ),
    Chat(
        chatId = 7,
        message = Message(
            content = "Do you want to meet tomorrow?",
            timeStamp = "12/03/2024 04:20 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "David",
        userImage = "https://example.com/david_image.jpg"
    ),
    Chat(
        chatId = 8,
        message = Message(
            content = "Sure, let's meet!",
            timeStamp = "12/03/2024 04:25 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userName = "Emily",
        userImage = "https://baconmockup.com/250/250/"
    ),
    Chat(
        chatId = 9,
        message = Message(
            content = "Happy birthday!",
            timeStamp = "12/04/2024 09:00 AM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Daniel",
        userImage = "https://dummyimage.com/300.png/09f/fff&text=Ash+Allen"
    ),
    Chat(
        chatId = 10,
        message = Message(
            content = "Thank you!",
            timeStamp = "12/04/2024 09:05 AM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Olivia",
        userImage = "https://placekitten.com/250/250"
    ),
    Chat(
        chatId = 11,
        message = Message(
            content = "Let's go for lunch.",
            timeStamp = "12/04/2024 12:30 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.ERROR
        ),
        userName = "Sophia",
        userImage = "https://placebear.com/250/250"
    ),
    Chat(
        chatId = 12,
        message = Message(
            content = "I'm busy, maybe later.",
            timeStamp = "12/04/2024 12:45 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "James",
        userImage = "https://loremflickr.com/250/250/dog"
    ),
    Chat(
        chatId = 13,
        message = Message(
            content = "Congratulations!",
            timeStamp = "12/05/2024 03:00 PM",
            messageType = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Liam",
        userImage = "https://placebeard.it/250/250"
    ),
    Chat(
        chatId = 14,
        message = Message(
            content = "Thank you so much!",
            timeStamp = "12/05/2024 03:05 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userName = "Ava",
        userImage = "https://www.gravatar.com/avatar/2c7d99fe281ecd3bcd65ab915bac6dd5?s=250"
    ),
    Chat(
        chatId = 15,
        message = Message(
            content = "How was the party?",
            timeStamp = "12/05/2024 08:30 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Benjamin",
        userImage = "https://i.pravatar.cc/250?u=mail@ashallendesign.co.uk"
    ),
    Chat(
        chatId = 16,
        message = Message(
            content = "It was amazing!",
            timeStamp = "12/05/2024 08:35 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Isabella",
        userImage = "https://example.com/david_image.jpg"
    ),
    Chat(
        chatId = 17,
        message = Message(
            content = "Can you send me the documents?",
            timeStamp = "12/06/2024 10:00 AM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Ethan",
        userImage = "https://avatar.iran.liara.run/public/boy?username=Ash"
    ),
    Chat(
        chatId = 18,
        message = Message(
            content = "Sure, I'll send them.",
            timeStamp = "12/06/2024 10:05 AM",
            messageType = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Mia",
        userImage = "https://api.dicebear.com/7.x/adventurer-neutral/svg?seed=mail@ashallendesign.co.uk"
    ),
    Chat(
        chatId = 19,
        message = Message(
            content = "Don't forget about the meeting.",
            timeStamp = "12/06/2024 02:30 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Noah",
        userImage = "https://robohash.org/mail@ashallendesign.co.uk"
    ),
    Chat(
        chatId = 20,
        message = Message(
            content = "I won't!",
            timeStamp = "12/06/2024 02:35 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Charlotte",
        userImage = "https://baconmockup.com/250/250/"
    ),
    Chat(
        chatId = 21,
        message = Message(
            content = "Did you finish the report?",
            timeStamp = "12/07/2024 11:00 AM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "William",
        userImage = "https://dummyimage.com/300.png/09f/fff&text=Ash+Allen"
    ),
    Chat(
        chatId = 22,
        message = Message(
            content = "Not yet, almost done!",
            timeStamp = "12/07/2024 11:15 AM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Amelia",
        userImage = "https://placekitten.com/250/250"
    ),
    Chat(
        chatId = 23,
        message = Message(
            content = "Let's meet at the cafe.",
            timeStamp = "12/07/2024 03:30 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Henry",
        userImage = "https://placebear.com/250/250"
    ),
    Chat(
        chatId = 24,
        message = Message(
            content = "I'm already here!",
            timeStamp = "12/07/2024 03:35 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Evelyn",
        userImage = "https://loremflickr.com/250/250/dog"
    ),
    Chat(
        chatId = 25,
        message = Message(
            content = "Don't forget about the party tonight.",
            timeStamp = "12/07/2024 07:00 PM",
            messageType = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Logan",
        userImage = "https://placebeard.it/250/250"
    )
)