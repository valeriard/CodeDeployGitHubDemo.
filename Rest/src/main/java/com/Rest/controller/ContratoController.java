package com.Rest.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.model.Contrato;
import com.Rest.service.ContratoService;



@RestController
@RequestMapping(value="rest/contratos/")
public class ContratoController {
	
	@Autowired
	private  ContratoService contratosservice;
	
	@GetMapping(value="vercontratos")
	public List<Contrato> vercontratos(){
		return contratosservice.verContratos();
	}
	
	@PostMapping(value="anadir")
	public Contrato agregar(@RequestBody Contrato contrato) {
		return contratosservice.agregar(contrato);
	}
	
	@PutMapping(value="modificar")
	public Contrato modificar(@RequestBody Contrato contrato ) {
		return contratosservice.modificar(contrato);
	}
	
	@DeleteMapping(value="eliminar")
	public void eliminar(@RequestParam Integer id) {
		contratosservice.eliminar(id);
		
	}

}
