package com.example.petstore.api

import org.springframework.data.annotation.Id

data class Category(
        @Id
        val id: String? = null,
        val name: String? = null
)