package com.example.petstore.api

import org.springframework.data.annotation.Id

data class Pet(
        @Id
        val id: String? = null,
        val name: String? = null,
        val category: Category? = null,
        val status: String? = null
)