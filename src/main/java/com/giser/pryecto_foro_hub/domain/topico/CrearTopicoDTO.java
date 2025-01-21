package com.giser.pryecto_foro_hub.domain.topico;

import com.giser.pryecto_foro_hub.domain.curso.Curso;
import com.giser.pryecto_foro_hub.domain.respuesta.Respuesta;
import com.giser.pryecto_foro_hub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public record CrearTopicoDTO(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Long usuarioId,
        @NotNull
        Long cursoId
){


}