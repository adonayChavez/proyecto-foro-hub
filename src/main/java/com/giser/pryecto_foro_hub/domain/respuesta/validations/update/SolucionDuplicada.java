package com.giser.pryecto_foro_hub.domain.respuesta.validations.update;


import com.giser.pryecto_foro_hub.domain.respuesta.ActualizarRespuestaDTO;
import com.giser.pryecto_foro_hub.domain.respuesta.Respuesta;
import com.giser.pryecto_foro_hub.domain.respuesta.RespuestaRepository;
import com.giser.pryecto_foro_hub.domain.topico.Estado;
import com.giser.pryecto_foro_hub.domain.topico.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SolucionDuplicada implements ValidarRespuestaActualizada {

    @Autowired
    private RespuestaRepository respuestaRepository;

    @Autowired
    private TopicoRepository topicoRepository;

    @Override
    public void validate(ActualizarRespuestaDTO data, Long respuestaId) {
        if (data.solucion()){
            Respuesta respuesta = respuestaRepository.getReferenceById(respuestaId);
            var topicoResuelto = topicoRepository.getReferenceById(respuesta.getTopico().getId());
            if (topicoResuelto.getEstado() == Estado.CLOSED){
                throw new ValidationException("Este topico ya esta solucionado.");
            }
        }
    }

}
