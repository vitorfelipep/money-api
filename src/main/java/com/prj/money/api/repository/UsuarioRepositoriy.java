/**
 * 
 */
package com.prj.money.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prj.money.api.model.Usuario;


/**
 * @author vitor
 *
 */
public interface UsuarioRepositoriy extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email);
}
