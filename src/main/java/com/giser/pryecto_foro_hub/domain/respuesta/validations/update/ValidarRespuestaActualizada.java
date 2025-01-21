package com.giser.pryecto_foro_hub.domain.respuesta.validations.update;

import com.giser.pryecto_foro_hub.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
