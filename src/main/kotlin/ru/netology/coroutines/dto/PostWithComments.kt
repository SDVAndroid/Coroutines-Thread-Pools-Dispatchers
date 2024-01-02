package ru.netology.coroutines.dto

import dto.Author

data class PostWithComments(
    val post: Post,
    val authorPost: Author,
    val comments: List<Comment>

)
