package com.example.petstore.impl

import com.example.petstore.api.Pet
import org.springframework.data.rest.core.annotation.*
import org.springframework.stereotype.Component

@RepositoryEventHandler
@Component
class PetEventHandler {

    @HandleAfterCreate
    fun logPetCreate(pet: Pet) {
        println("Created Pet ${pet.name} - ${pet.category}")
    }
}
