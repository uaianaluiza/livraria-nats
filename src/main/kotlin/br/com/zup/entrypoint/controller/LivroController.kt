package br.com.zup.entrypoint.controller

import br.com.zup.core.model.Livro
import br.com.zup.service.LivroService
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import org.slf4j.LoggerFactory
import java.util.*

@Controller("/livros")
class LivroController(private val livroService: LivroService){
    private val logger = LoggerFactory.getLogger(LivroController::class.java)

    @Post
    fun create(@Body livro: Livro):HttpResponse<Any>{
        logger.info("Livro salvo com sucesso!$livro ")
        return HttpResponse.created(HttpStatus.ACCEPTED).body(this.livroService.send(livro))
    }

    @Put("/{id}")
    fun update(@PathVariable uuid: UUID, @Body livro: Livro):HttpResponse<Livro>{
        return HttpResponse.ok(HttpStatus.OK).body(this.livroService.send(livro))
    }
}