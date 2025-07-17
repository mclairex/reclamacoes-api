package com.mariaclara.ouvidoria_digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariaclara.ouvidoria_digital.model.Usuario.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, String> {
    boolean existsByEmail(String email);
}
