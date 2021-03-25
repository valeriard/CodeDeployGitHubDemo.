package com.Rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.Rest.model.Usuario;
import com.Rest.service.UsuarioService;

@RestController
@RequestMapping(value = "usuario/")
public class UsuarioController {
	
	    @Autowired
		private UsuarioService usuarioservi;
	    
	
		@PostMapping(value="anadir")
		public ResponseEntity<Object> adicionar(@RequestBody Usuario usuario)
		{
			return usuarioservi.agregarUsuario(usuario);
		}
		
		@GetMapping(value = "listar-usuarios")
	    public Usuario obtenerUsuario(@RequestParam String nombre){
			return usuarioservi.obtenerUsuario(nombre);
		}

}
