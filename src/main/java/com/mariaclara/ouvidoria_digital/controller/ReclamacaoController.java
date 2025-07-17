package com.mariaclara.ouvidoria_digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mariaclara.ouvidoria_digital.dto.DadosReclamacoes;
import com.mariaclara.ouvidoria_digital.dto.DadosStatus;
import com.mariaclara.ouvidoria_digital.model.Reclamacao.ReclamacaoModel;
import com.mariaclara.ouvidoria_digital.repository.ReclamacaoRepository;


@RestController
@RequestMapping("/reclamacoes") //rota
public class ReclamacaoController {

    @Autowired
    private ReclamacaoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosReclamacoes dados){
        repository.save(new ReclamacaoModel(dados));
    }

    @PatchMapping("/reclamacoes/status")
    public ResponseEntity<Void> atualizarStatus(@PathVariable Long id, @RequestBody DadosStatus status){
        ReclamacaoModel reclamacao = repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    
    reclamacao.setStatus(status.getStatus());
    repository.save(reclamacao);
    return ResponseEntity.noContent().build();
    }
}
