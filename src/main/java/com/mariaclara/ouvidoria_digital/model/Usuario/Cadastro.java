package com.mariaclara.ouvidoria_digital.model.Usuario;

import com.mariaclara.ouvidoria_digital.dto.DadosUsuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cadastros")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cadastro{
    public Cadastro(DadosUsuario dadosUsuario) {}
    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    
    private String id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
}
