package com.giser.pryecto_foro_hub.domain.usuario;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usuarios")
@Entity(name="Usuario")
@EqualsAndHashCode(of = "id")
public class Usuario implements UserDetails {

    @SuppressWarnings("unused")
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
    private String nombre;
    private String apellido;
    private String email;
    private Boolean enabled;

    public Usuario(CrearUsuarioDTO crearUsuarioDTO, String hashedPassword) {
        this.username = crearUsuarioDTO.username();
        this.password = hashedPassword;
        this.role = Role.USUARIO;
        this.nombre = capitalizado(crearUsuarioDTO.nombre());
        this.apellido = capitalizado(crearUsuarioDTO.apellido());
        this.email = crearUsuarioDTO.email();
        this.enabled = true;
    }

    public void actualizarUsuarioConPassword(ActualizarUsuarioDTO actualizarUsuarioDTO, String hashedPassword) {
        if (actualizarUsuarioDTO.password() != null){
            this.password = hashedPassword;
        }
        if (actualizarUsuarioDTO.role() != null){
            this.role = actualizarUsuarioDTO.role();
        }
        if (actualizarUsuarioDTO.nombre() != null){
            this.nombre = capitalizado(actualizarUsuarioDTO.nombre());
        }
        if (actualizarUsuarioDTO.apellido() != null){
            this.apellido = capitalizado(actualizarUsuarioDTO.apellido());
        }
        if (actualizarUsuarioDTO.email() != null){
            this.email = actualizarUsuarioDTO.email();
        }
        if (actualizarUsuarioDTO.enabled() != null){
            this.enabled = actualizarUsuarioDTO.enabled();
        }
    }


    public void actualizarUsuario(ActualizarUsuarioDTO actualizarUsuarioDTO) {
        if (actualizarUsuarioDTO.role() != null){
            this.role = actualizarUsuarioDTO.role();
        }
        if (actualizarUsuarioDTO.nombre() != null){
            this.nombre = capitalizado(actualizarUsuarioDTO.nombre());
        }
        if (actualizarUsuarioDTO.apellido() != null){
            this.apellido = capitalizado(actualizarUsuarioDTO.apellido());
        }
        if (actualizarUsuarioDTO.email() != null){
            this.email = actualizarUsuarioDTO.email();
        }
        if (actualizarUsuarioDTO.enabled() != null){
            this.enabled = actualizarUsuarioDTO.enabled();
        }
    }

    public void eliminarUsuario(){
        this.enabled = false;
    }

    private String capitalizado(String string) {
        return string.substring(0,1).toUpperCase()+string.substring(1).toLowerCase();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
