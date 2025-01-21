package com.giser.pryecto_foro_hub.domain.topico.validations.update;

import com.giser.pryecto_foro_hub.domain.topico.ActualizarTopicoDTO;
import com.giser.pryecto_foro_hub.domain.topico.TopicoRepository;

public interface ValidarTopicoActualizado {
    void validate(ActualizarTopicoDTO data);
}
