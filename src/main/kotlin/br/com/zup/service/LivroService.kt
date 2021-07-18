package br.com.zup.service

import br.com.zup.core.model.Livro
import javax.inject.Singleton

@Singleton
interface LivroService {
    fun send(livro: Livro): Livro
}