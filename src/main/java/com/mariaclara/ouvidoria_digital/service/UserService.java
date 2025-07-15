package com.mariaclara.ouvidoria_digital.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mariaclara.ouvidoria_digital.domain.usuario.Usuario;
//import com.mariaclara.ouvidoria_digital.domain.usuario.UsuarioRepository;
import com.mariaclara.ouvidoria_digital.dto.DadosUsuario;
import com.mariaclara.ouvidoria_digital.model.Usuario.DadosDetalhamentoUsuario;
import com.mariaclara.ouvidoria_digital.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserService {
    
    
    private final UserRepository usuarioRepository;

    private final PasswordEncoder passwordEncoder;
    
    @Transactional
    public DadosDetalhamentoUsuario cadastrarUsuario (DadosUsuario dados){
        var senhaEncriptada = passwordEncoder.encode(dados.senha());
        Usuario usuario = Usuario.builder()
        .nome(dados.nome())
        .email(dados.email())
        .cpf(dados.cpf())
        .senha(senhaEncriptada)
        .build();
        usuarioRepository.save(usuario);
        return new DadosDetalhamentoUsuario(usuario);
    }
}
