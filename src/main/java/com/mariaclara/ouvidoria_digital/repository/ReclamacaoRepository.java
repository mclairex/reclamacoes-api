package com.mariaclara.ouvidoria_digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariaclara.ouvidoria_digital.model.Reclamacao.ReclamacaoModel;

import java.util.List;

public interface ReclamacaoRepository extends JpaRepository<ReclamacaoModel, Long> {
    List<ReclamacaoModel> findByCpf(String cpf); //
}

