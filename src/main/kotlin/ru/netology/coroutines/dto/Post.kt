package ru.netology.coroutines.dto

import dto.Attachment

data class Post(
    val id: Long,
    val authorId: Long,
    val authorAvatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    val attachment: Attachment? = null
)