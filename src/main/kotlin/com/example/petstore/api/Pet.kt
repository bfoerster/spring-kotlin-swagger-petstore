package com.example.petstore.api

import org.springframework.data.annotation.Id

data class Pet(
        @Id
        val id: String? = null,
        val category: Category? = null,
        val name: String? = null,
        val photoUrls: List<String> = emptyList(),
        val tags: Set<Tag> = emptySet(),
        val status: PetStatus? = PetStatus.pending
)