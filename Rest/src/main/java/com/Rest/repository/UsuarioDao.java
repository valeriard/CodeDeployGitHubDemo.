package com.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.model.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer>{
	public Usuario findByNombre(String nombre);
}
