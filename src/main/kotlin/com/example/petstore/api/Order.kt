package com.example.petstore.api

import org.springframework.data.annotation.Id
import java.util.*

data class Order(
        @Id
        val id: String? = null,
        val pet: Pet? = null,
        val quantity: Int = 0,
        val shipDate: Date? = null,
        val status: OrderStatus = OrderStatus.placed,
        val complete: Boolean = false
)