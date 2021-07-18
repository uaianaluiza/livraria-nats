package br.com.zup.infrastructure.client.model

import br.com.zup.core.model.Livro
import java.util.*

data class EventsInformationsDto(
    val events: Events = Events.SAVE_LIVRO,
    val product: Livro = Livro(UUID.fromString(""))
        )