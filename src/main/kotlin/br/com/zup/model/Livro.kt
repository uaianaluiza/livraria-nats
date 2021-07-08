package br.com.zup.model

import java.util.*

data class Livro(
    val id: UUID? = null,
    val nome: String = "",
    val nomeAutor: String = "",
    val anoDePublicacao: String = "",
)
