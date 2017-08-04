package com.example.petstore.api

import org.springframework.data.annotation.Id

data class Pet(
        val name: String
) {
    constructor() : this("")

    @Id
    val id: String? = null
    val category: Category? = null
    val status: String? = null
}