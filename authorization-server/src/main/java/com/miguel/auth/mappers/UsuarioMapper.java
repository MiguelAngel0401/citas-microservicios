package com.miguel.auth.mappers;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.miguel.auth.dto.UsuarioRequest;
import com.miguel.auth.dto.UsuarioResponse;
import com.miguel.auth.entities.Rol;
import com.miguel.auth.entities.Usuario;

@Component
public class UsuarioMapper {

    public UsuarioResponse entityToResponse(Usuario usuario) {
        if (usuario == null) return null;
        return new UsuarioResponse(
                usuario.getUsername(),
                usuario.getRoles().stream()
                        .map(Rol::getNombre)
                        .collect(Collectors.toSet())
        );
    }

    public Usuario requestToEntity(UsuarioRequest request, String password, Set<Rol> roles) {
        if (request == null) return null;
        Usuario usuario = new Usuario();
        usuario.setUsername(request.username());
        usuario.setPassword(password);
        usuario.setRoles(roles);
        return usuario;
    }
}
