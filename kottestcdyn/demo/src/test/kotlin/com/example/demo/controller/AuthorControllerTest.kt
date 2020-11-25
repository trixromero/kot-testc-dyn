package com.example.demo.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@ActiveProfiles("test")
@ExtendWith(SpringExtension::class)
@WebMvcTest(AuthorController::class)
class AuthorControllerTest {

    private val uri: String = "/authors"

    @Autowired
    private lateinit var mockWebMvcTest: MockMvc

    private val objectMapper: ObjectMapper = ObjectMapper()

    @Test
    fun `should return 200 ok Author`() {
        mockWebMvcTest.perform(get("$uri")).andExpect(status().isOk)
    }

}