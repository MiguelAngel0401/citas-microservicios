package com.miguel.auth.services;

import java.util.Set;

import com.miguel.auth.dto.UsuarioRequest;
import com.miguel.auth.dto.UsuarioResponse;

public interface UsuarioService {

    Set<UsuarioResponse> listar();

    UsuarioResponse registrar(UsuarioRequest request);

    UsuarioResponse eliminar(String username);
}

