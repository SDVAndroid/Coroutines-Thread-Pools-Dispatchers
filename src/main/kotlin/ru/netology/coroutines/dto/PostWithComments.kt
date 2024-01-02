package ru.netology.coroutines.dto

import dto.Author

data class PostWithComments(
    val post: Post,
    val author: Author,
    val comments: List<Comment>

)
