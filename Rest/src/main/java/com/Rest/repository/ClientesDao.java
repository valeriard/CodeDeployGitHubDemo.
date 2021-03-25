package com.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.model.Clientes;

@Repository
public interface ClientesDao extends JpaRepository<Clientes, Integer>{

	
}
