package com.example.demo.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="DetalleUsuario")

public class DetalleUsuario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long identificacion;
		
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "apellido")
		private String apellido;
		@Column(name = "telefono")
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
