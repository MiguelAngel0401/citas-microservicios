package com.miguel.auth.dto;

public record CustomErrorResponse(
        int codigo,
        String mensaje
) {
}