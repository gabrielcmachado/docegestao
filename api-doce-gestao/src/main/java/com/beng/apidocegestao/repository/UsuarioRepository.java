package com.beng.apidocegestao.repository;

import com.beng.apidocegestao.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
