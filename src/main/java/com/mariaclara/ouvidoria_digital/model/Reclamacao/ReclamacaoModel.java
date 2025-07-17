//Nome antigo era ReclamacaoModel

package com.mariaclara.ouvidoria_digital.model.Reclamacao;

import java.time.LocalDate;

import com.mariaclara.ouvidoria_digital.dto.DadosReclamacoes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table (name = "reclamacoes")
@Entity
public class ReclamacaoModel {

public ReclamacaoModel() {}

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, length = 11)
private String cpf;

@Column(nullable = false, length = 50)
private String titulo;

@Column(nullable = false)
private LocalDate dataCriacao;

@Column(nullable = false, columnDefinition = "TEXT") //"TEXT" não tem limite de caracteres
private String descricao;

@Column(nullable = false)
private String status;

public ReclamacaoModel(DadosReclamacoes dados) {
    this.cpf = dados.getCpf();
    this.titulo = dados.getTitulo();
    this.dataCriacao = LocalDate.now();
    this.descricao = dados.getDescricao();
    this.status = "pendente";
}
}
