package com.giser.pryecto_foro_hub.domain.usuario.validations.create;


import com.giser.pryecto_foro_hub.domain.usuario.CrearUsuarioDTO;
import com.giser.pryecto_foro_hub.domain.usuario.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioDuplicado implements ValidarCrearUsuario{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public void validate(CrearUsuarioDTO data) {
        var usuarioDuplicado = repository.findByUsername(data.username());
        if(usuarioDuplicado != null){
            throw new ValidationException("Este usuario ya existe.");
        }

        var emailDuplicado = repository.findByEmail(data.email());
        if(emailDuplicado != null){
            throw new ValidationException("Este email ya existe.");
        }
    }

}

