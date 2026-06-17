package com.miguel.auth.services;

import com.miguel.auth.dto.LoginRequest;
import com.miguel.auth.dto.TokenResponse;

public interface AuthService {

    TokenResponse autenticar(LoginRequest request) throws Exception;
}