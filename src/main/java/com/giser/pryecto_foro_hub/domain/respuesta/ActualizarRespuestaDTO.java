package com.giser.pryecto_foro_hub.domain.respuesta;


public record ActualizarRespuestaDTO(
        String mensaje,
        Boolean solucion,
        Boolean borrado
) {
}
