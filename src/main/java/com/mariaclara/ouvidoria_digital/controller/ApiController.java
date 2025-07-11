package com.mariaclara.ouvidoria_digital.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public ResponseEntity <String> helloWorld(){
        return ResponseEntity.ok ("Hello Mundo!");
    }
}
