package com.mariaclara.ouvidoria_digital.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.mariaclara.ouvidoria_digital.domain.usuario.Usuario;
//import com.mariaclara.ouvidoria_digital.domain.usuario.UsuarioRepository;
import com.mariaclara.ouvidoria_digital.dto.DadosUsuario;
//import com.mariaclara.ouvidoria_digital.model.Usuario.Cadastro;
import com.mariaclara.ouvidoria_digital.model.Usuario.DadosDetalhamentoUsuario;
//import com.mariaclara.ouvidoria_digital.repository.CadastroRepository;
//import com.mariaclara.ouvidoria_digital.repository.UserRepository;
import com.mariaclara.ouvidoria_digital.service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    private final UserService userService;

public CadastroController(UserService userService){
    this.userService = userService;
}

    @PostMapping
    public DadosDetalhamentoUsuario cadastrar (@RequestBody @Valid DadosUsuario dadosUsuario) {
        //var usuario = userService.cadastrarUsuario(dadosUsuario);
        return userService.cadastrarUsuario(dadosUsuario);
    }

}
