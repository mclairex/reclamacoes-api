package com.mariaclara.ouvidoria_digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariaclara.ouvidoria_digital.domain.usuario.Usuario;

public interface UserRepository extends JpaRepository<Usuario,Long>{
    
}
