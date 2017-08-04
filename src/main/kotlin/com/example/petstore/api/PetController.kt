package com.example.petstore.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PetController {

    @GetMapping("/pet/{petId}")
    fun findById(@PathVariable("petId") id: Long) = Pet(id, "Waldi")
}