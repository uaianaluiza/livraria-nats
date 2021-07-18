package br.com.zup.client

import br.com.zup.core.model.Livro
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
interface LivroClient {
    @Subject ("livros")
    fun send(livro: Livro)
}