package com.mariaclara.ouvidoria_digital.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    UserDetails findByEmail(String username);
}
