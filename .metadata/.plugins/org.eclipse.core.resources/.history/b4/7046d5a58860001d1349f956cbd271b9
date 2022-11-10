package com.example.demo.Entidad;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.Enum.Estado;

@Entity
@Table (name="Categoria")

public class Categoria {
		
		private Long Id;
		private String nombre;
		private Estado estado;
		private List <Categoria> subCategoria;
		
		public Categoria(Long id, String nombre, Estado estado, List<Categoria> subCategoria) {
			super();
			Id = id;
			this.nombre = nombre;
			this.estado = estado;
			this.subCategoria = subCategoria;
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
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

		public List<Categoria> getSubCategoria() {
			return subCategoria;
		}

		public void setSubCategoria(List<Categoria> subCategoria) {
			this.subCategoria = subCategoria;
		}
		
		
}
