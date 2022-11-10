package com.example.demo.Entidad;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Carrito")

public class Carrito {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		// Definimos la relacion de muchos a Uno//
		@ManyToOne (fetch = FetchType.EAGER)
		// Esta anotacion permite identificar el nombre de la columna //
		@JoinColumn(name = "producto_id")
		private Producto producto;
		
		// Relacion uno a uno //
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "usuario_id", referencedColumnName = "id")
		private Usuario usuario;
		
		@Column(name = "cantidad")
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
