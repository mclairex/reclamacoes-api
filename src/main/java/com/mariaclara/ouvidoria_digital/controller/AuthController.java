package com.mariaclara.ouvidoria_digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.mariaclara.ouvidoria_digital.infra.security.DadosTokenJWT;
import com.mariaclara.ouvidoria_digital.service.TokenService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariaclara.ouvidoria_digital.controller.usuario.dadosUsuario;
import com.mariaclara.ouvidoria_digital.domain.usuario.Usuario;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")

public class AuthController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity <DadosTokenJWT> efetuarLogin(@RequestBody @Valid dadosUsuario dados) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.email(), dados.senha());
        var authentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }
}