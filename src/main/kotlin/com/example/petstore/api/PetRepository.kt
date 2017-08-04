package com.example.petstore.api

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param

interface PetRepository : MongoRepository<Pet, String> {

    fun findByStatus(@Param("status") status: String): Collection<Pet>
}

