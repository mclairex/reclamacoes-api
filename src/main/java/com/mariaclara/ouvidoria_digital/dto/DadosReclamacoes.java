package com.mariaclara.ouvidoria_digital.dto;

//import java.time.LocalDate;

import lombok.Data;

@Data
public class DadosReclamacoes {
    private String cpf;
    private String titulo;
    //private LocalDate dataCriacao;
    private String descricao;
}
