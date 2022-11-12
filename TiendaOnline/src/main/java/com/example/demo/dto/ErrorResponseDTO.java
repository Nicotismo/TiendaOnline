package com.example.demo.dto;

import java.util.List;

public class ErrorResponseDTO {
		
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<ValidationErrorDTO> getErrores() {
		return errores;
	}

	public void setErrores(List<ValidationErrorDTO> errores) {
		this.errores = errores;
	}

	public ErrorResponseDTO(String mensaje, int codigoEstado, String path, List<ValidationErrorDTO> errores) {
		super();
		this.mensaje = mensaje;
		this.codigoEstado = codigoEstado;
		this.path = path;
		this.errores = errores;
	}

	private String mensaje;
	private int codigoEstado;
	private String path;
	
	private List <ValidationErrorDTO> errores;

	public ErrorResponseDTO() {
		super();
	}
	
}
