package com.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.model.Contrato;
@Repository
public interface ContratoDao extends JpaRepository<Contrato, Integer>{

}
