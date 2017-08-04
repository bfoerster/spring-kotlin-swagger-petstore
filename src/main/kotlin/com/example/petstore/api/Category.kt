package com.example.petstore.api

import org.springframework.data.annotation.Id

data class Category(val name: String) {
    constructor() : this("")

    @Id
    val id: String? = null
}