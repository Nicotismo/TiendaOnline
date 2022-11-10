package com.example.demo.Entidad;



import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.Enum.Estado;

@Entity
@Table (name="Producto")

public class Producto {
		
		private Long Id;
		private String nombre;
		private BigDecimal precio;
		private int stock;
		private String imagen;
		private BigDecimal precioCompra;
		private Estado estado;
		private LocalDate fechaRegistro;
		private Categoria categoria;
		
		
		public Producto(Long id, String nombre, BigDecimal precio, int stock, String imagen, BigDecimal precioCompra,
				Estado estado, LocalDate fechaRegistro, Categoria categoria) {
			super();
			Id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.stock = stock;
			this.imagen = imagen;
			this.precioCompra = precioCompra;
			this.estado = estado;
			this.fechaRegistro = fechaRegistro;
			this.categoria = categoria;
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


		public BigDecimal getPrecio() {
			return precio;
		}


		public void setPrecio(BigDecimal precio) {
			this.precio = precio;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}


		public String getImagen() {
			return imagen;
		}


		public void setImagen(String imagen) {
			this.imagen = imagen;
		}


		public BigDecimal getPrecioCompra() {
			return precioCompra;
		}


		public void setPrecioCompra(BigDecimal precioCompra) {
			this.precioCompra = precioCompra;
		}


		public Estado getEstado() {
			return estado;
		}


		public void setEstado(Estado estado) {
			this.estado = estado;
		}


		public LocalDate getFechaRegistro() {
			return fechaRegistro;
		}


		public void setFechaRegistro(LocalDate fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}


		public Categoria getCategoria() {
			return categoria;
		}


		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		
		
}
