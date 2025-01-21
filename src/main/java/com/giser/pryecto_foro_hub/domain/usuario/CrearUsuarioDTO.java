package com.giser.pryecto_foro_hub.domain.usuario;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

public record CrearUsuarioDTO(
        @NotBlank String username,
        @NotBlank String password,
        @NotBlank String nombre,
        @NotBlank String apellido,
        @NotBlank @Email String email
) {
}
