package com.mariaclara.ouvidoria_digital.model.Usuario;

import com.mariaclara.ouvidoria_digital.domain.usuario.Usuario;

public record DadosDetalhamentoUsuario(Long id, String nome, String email, String cpf) {
    public DadosDetalhamentoUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getCpf());
    }
}
