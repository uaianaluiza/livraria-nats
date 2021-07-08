package br.com.zup.service

import br.com.zup.client.LivroClient
import br.com.zup.model.Livro
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
