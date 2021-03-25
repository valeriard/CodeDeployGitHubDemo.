package com.Rest.response;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.class)
public class RespuestaPersonalizada {

	private String codigo;
	private String mensaje;
	private int estado;
	private String objetorespuesta;
	
	public RespuestaPersonalizada() {
		super();
		
	}
	
	public RespuestaPersonalizada(String mensaje, HttpStatus estado) {
		super();
		
		this.mensaje=mensaje;
		this.estado=estado.value();
		//this.codigo=codigo.name();
		
		
		
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getObjetorespuesta() {
		return objetorespuesta;
	}

	public void setObjetorespuesta(String objetorespuesta) {
		this.objetorespuesta = objetorespuesta;
	}
	
	
}
