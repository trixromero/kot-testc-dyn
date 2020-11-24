package com.example.demo.model

data class Author (private val id: String,
                    private val name:String,
                private val documentType:DocumentType,
            private val age:Int,
        private val email:String)


enum class DocumentType(
     private val CPF:String
)