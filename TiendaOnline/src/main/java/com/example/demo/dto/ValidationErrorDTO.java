package com.example.demo.dto;

public class ValidationErrorDTO {
	
	private String campo;
	private String error;
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public ValidationErrorDTO(String campo, String error) {
		super();
		this.campo = campo;
		this.error = error;
	}
}
