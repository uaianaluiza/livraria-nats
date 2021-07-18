package br.com.zup.core.service

import br.com.zup.infrastructure.client.LivroClient
import br.com.zup.core.model.Livro
import br.com.zup.service.LivroService
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class LivroServiceImpl(private val livroClient: LivroClient) : LivroService {

    private val logger = LoggerFactory.getLogger(LivroServiceImpl::class.java)

    override fun send(livro: Livro): Livro {
        livroClient.send(livro)
        logger.info("envio realizado")
        return livro
    }
}
