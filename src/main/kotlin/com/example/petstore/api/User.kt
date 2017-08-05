package com.example.petstore.api

data class User(
        val id: String? = null,
        val username: String? = null,
        val firstName: String? = null,
        val lastName: String? = null,
        val email: String? = null,
        val password: String? = null,
        val phone: String? = null,
        val userStatus: Int = 0
)