package com.Rest.controller;

import java.io.Serializable;
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
import com.Rest.model.Clientes;
import com.Rest.service.ClienteService;

@RestController
@RequestMapping(value = "rest/clientes/")
public class ClientesController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private ClienteService clienteservice;
	
	@GetMapping(value="verclientes")
	public List<Clientes> verclientes(){
		return clienteservice.verclientes();
	}
	
	@PostMapping(value="anadir")
	public Clientes agregarcliente(@RequestBody Clientes cliente)
	{
		return clienteservice.agregarcliente(cliente);
	}
	
	@PutMapping(value="modificar")
	public Clientes modificar(@RequestBody Clientes cliente)
	{
		return clienteservice.modificar(cliente);
	}
	
	@DeleteMapping(value="eliminar")
	public void eliminar(@RequestParam  Integer id)
	{
		clienteservice.eliminar(id);
	}
	

}
