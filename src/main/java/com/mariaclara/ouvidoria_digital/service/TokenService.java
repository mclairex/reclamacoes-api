package com.mariaclara.ouvidoria_digital.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.mariaclara.ouvidoria_digital.domain.usuario.Usuario;


@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String gerarToken(Usuario usuario) {
        try{
            var algoritmo = Algorithm.HMAC256(secret);
            return JWT.create()
                .withIssuer("Ouvidoria_Digital")
                .withSubject(usuario.getEmail())
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritmo);
                
        } catch(JWTCreationException exception) {
            throw new RuntimeException("erro ao gerar token jwt", exception);
        }
    }

    private Instant dataExpiracao(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }

    public String getSubject(String tokenJWT) {
        try{
            return JWT.require(Algorithm.HMAC256(secret))
            .withIssuer("Ouvidoria_Digital")
            .build()
            .verify(tokenJWT)
            .getSubject();
        } catch(Exception e){
            throw new RuntimeException("Token inválido ou expirado.");
        }
    }
}
