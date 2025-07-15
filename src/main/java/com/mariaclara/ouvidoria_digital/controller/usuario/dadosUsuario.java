package com.mariaclara.ouvidoria_digital.controller.usuario;

import jakarta.validation.constraints.NotBlank;

public record dadosUsuario (
    @NotBlank String email,
    @NotBlank String senha 
 ) {}



