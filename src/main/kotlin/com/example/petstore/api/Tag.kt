package com.example.petstore.api

import org.springframework.data.annotation.Id

data class Tag(
        @Id
        val id: String? = null,
        val name: String? = null
)