package com.Rest.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import com.Rest.model.Clientes;
import com.Rest.repository.ClientesDao;

@Service
public class ClienteService {
	
	@Autowired
	private ClientesDao clientesdao;
	
	public List<Clientes> verclientes(){
		return clientesdao.findAll();
	}
	
	@PostMapping(value="anadir")
	public Clientes agregarcliente(@RequestBody Clientes clientes)
	{
		return clientesdao.save(clientes);
	}
	
	@PutMapping(value="modificar")
	public Clientes modificar(@RequestBody Clientes clientes)
	{
		return clientesdao.save(clientes);
	}
	
	@DeleteMapping(value="eliminar")
	public void eliminar(@RequestParam  Integer id)
	{
		clientesdao.deleteById(id);
	}
	

}