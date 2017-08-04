package com.example.petstore.api

import org.springframework.data.mongodb.repository.MongoRepository

interface PetRepository : MongoRepository<Pet, String>