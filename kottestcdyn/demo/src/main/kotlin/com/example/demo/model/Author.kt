package com.example.demo.model

data class Author(private val id: String,
                  private val name: String,
                  private val documentType: DocumentType,
                  private val age: Int,
                  private val address:Address,
                  private val email: String)


enum class DocumentType {
    CPF,
    RG
}

data class Address(
        private val street:String,
        private val number:Int
)