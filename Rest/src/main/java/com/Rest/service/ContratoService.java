package com.Rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Rest.model.Contrato;
import com.Rest.repository.ContratoDao;


@Service
public class ContratoService {
	
	@Autowired
	private ContratoDao contratodao;
	
	public List<Contrato> verContratos(){
		return contratodao.findAll();
	}
	
	public Contrato agregar(@RequestBody Contrato contratos) {
		return contratodao.save(contratos);
	}
	
	public Contrato modificar(@RequestBody Contrato contratos) {
		return contratodao.save(contratos);
	}
	
	public void eliminar(@RequestParam Integer id) {
		contratodao.deleteById(id);
	}

}
