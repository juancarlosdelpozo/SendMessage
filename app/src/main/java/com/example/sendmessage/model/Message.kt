package com.example.sendmessage.model

import java.io.Serializable

data class Message(
    val text: String,
    val sender: Person
) : Serializable
