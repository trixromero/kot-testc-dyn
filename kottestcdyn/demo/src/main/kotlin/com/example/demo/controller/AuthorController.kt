package com.example.demo.controller

import com.example.demo.model.Address
import com.example.demo.model.Author
import com.example.demo.model.DocumentType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/authors")
class AuthorController {

    @GetMapping
    fun getAuthors():ResponseEntity<List<Author>>{

        val author = Author(id = "1", name = "Joao das neves", documentType = DocumentType.CPF,
        age = 29, address = Address("Alameda dos anjos", number=66), email = "snow@starks.com")

        return ResponseEntity.ok(listOf(author))
    }

}