package com.example.demo.Entidad;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="DetalleUsuario")

public class DetalleUsuario {
		
		private Long identificacion;
		private String nombre;
		private String apellido;
		private Integer telefono;
		public DetalleUsuario(Long identificacion, String nombre, String apellido, Integer telefono) {
			super();
			this.identificacion = identificacion;
			this.nombre = nombre;
			this.apellido = apellido;
			this.telefono = telefono;
		}
		public Long getIdentificacion() {
			return identificacion;
		}
		public void setIdentificacion(Long identificacion) {
			this.identificacion = identificacion;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public Integer getTelefono() {
			return telefono;
		}
		public void setTelefono(Integer telefono) {
			this.telefono = telefono;
		}
		
		
		
}
