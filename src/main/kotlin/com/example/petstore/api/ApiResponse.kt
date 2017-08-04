package com.example.petstore.api

data class ApiResponse(
        val code: Int,
        val type: String,
        val message: String
)