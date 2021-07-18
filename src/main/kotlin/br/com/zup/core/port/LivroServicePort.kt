package br.com.zup.core.port

import br.com.zup.core.model.Livro
import javax.inject.Singleton

@Singleton
interface LivroServicePort {
    fun send (livro: Livro): Livro
}