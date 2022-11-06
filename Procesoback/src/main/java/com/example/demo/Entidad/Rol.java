package com.example.demo.Entidad;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.Enum.Estado;

@Entity
@Table (name="Rol")

public class Rol {
		
		private Long id;
		private String nombre;
		private Estado estado;
		
		
		public Rol(Long id, String nombre, Estado estado) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.estado = estado;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public Estado getEstado() {
			return estado;
		}


		public void setEstado(Estado estado) {
			this.estado = estado;
		}

		
}
