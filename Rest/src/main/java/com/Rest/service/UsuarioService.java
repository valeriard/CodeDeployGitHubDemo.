package com.Rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Rest.model.Usuario;
import com.Rest.repository.UsuarioDao;
import com.Rest.response.RespuestaPersonalizada;



@Service
public class UsuarioService implements UserDetailsService{
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public ResponseEntity<Object> agregarUsuario(Usuario usuario){
		ResponseEntity<Object> respuesta;
		try {
			usuario.setClave(encoder.encode(usuario.getClave()));
			usuarioDao.save(usuario);
			RespuestaPersonalizada res = new RespuestaPersonalizada("Creacion usuario Exitosa", HttpStatus.OK);
			respuesta = ResponseEntity.ok(HttpStatus.OK);
			respuesta = new ResponseEntity<>(res,HttpStatus.OK);
		} catch (Exception e) {
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			RespuestaPersonalizada res = new RespuestaPersonalizada("Error creando usuario", HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
		}
		return respuesta;
	}
	
	public Usuario obtenerUsuario(String nombre) {
		
		return usuarioDao.findByNombre(nombre);
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByNombre(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ADMIN"));
		UserDetails user = new User(usuario.getNombre(), usuario.getClave(), authorities);
		return user;
	}
}
