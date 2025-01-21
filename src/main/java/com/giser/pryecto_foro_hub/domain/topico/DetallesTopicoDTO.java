package com.giser.pryecto_foro_hub.domain.topico;

import com.giser.pryecto_foro_hub.domain.curso.Categoria;
import com.giser.pryecto_foro_hub.domain.curso.Curso;
import com.giser.pryecto_foro_hub.domain.respuesta.Respuesta;
import com.giser.pryecto_foro_hub.domain.usuario.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public record DetallesTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        LocalDateTime ultimaActualizacion,
        Estado estado,
        String usuario,
        String curso,
        Categoria categoriaCurso
) {
    public DetallesTopicoDTO(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getUltimaActualizacion(),
                topico.getEstado(),
                topico.getUsuario().getUsername(),
                topico.getCurso().getName(),
                topico.getCurso().getCategoria()
        );
    }

}
