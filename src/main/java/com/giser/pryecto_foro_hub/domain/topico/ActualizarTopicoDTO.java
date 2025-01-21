package com.giser.pryecto_foro_hub.domain.topico;


public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}