package br.com.zup.model

import br.com.zup.core.model.Livro
import java.util.*

data class EventsInformationsDto(
    val events: Events = Events.SAVE_LIVRO,
    val product: Livro = Livro(UUID.fromString(""))
        )