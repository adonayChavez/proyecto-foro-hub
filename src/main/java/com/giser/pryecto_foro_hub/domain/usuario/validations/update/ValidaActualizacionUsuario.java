package com.giser.pryecto_foro_hub.domain.usuario.validations.update;


import com.giser.pryecto_foro_hub.domain.usuario.ActualizarUsuarioDTO;
import com.giser.pryecto_foro_hub.domain.usuario.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidaActualizacionUsuario implements ValidarActualizarUsuario {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public void validate(ActualizarUsuarioDTO data) {
        if(data.email() != null){
            var emailDuplicado = repository.findByEmail(data.email());
            if(emailDuplicado != null){
                throw new ValidationException("Este email ya esta en uso");
            }
        }
    }
}

