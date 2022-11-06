package com.example.demo.Entidad;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Carrito")

public class Carrito {
		
		private Long id;
		private Producto producto;
		private Usuario usuario;
		private int cantidad;
		
		//FALTA FUNCION CALCULAR//
		
		public Carrito(Long id, Producto producto, Usuario usuario, int cantidad) {
			super();
			this.id = id;
			this.producto = producto;
			this.usuario = usuario;
			this.cantidad = cantidad;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		
		
		
		
		
}
