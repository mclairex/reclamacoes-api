package com.mariaclara.ouvidoria_digital.repository;

import com.mariaclara.ouvidoria_digital.model.Reclamacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface reclamacaoRepositorio extends JpaRepository <Reclamacao, Long> {
    List <Reclamacao> findByandDeletedAtNull(String cpf); //findByCpf
}
