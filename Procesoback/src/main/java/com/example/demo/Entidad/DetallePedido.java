package com.example.demo.Entidad;



import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="DetallePedido")


public class DetallePedido {
		
		private Long id;
		private Producto producto;
		private Pedido orden;
		private int cantidad;
		private BigDecimal precioProducto;
		
		
		


		public DetallePedido(Long id, Producto producto, Pedido orden, int cantidad, BigDecimal precioProducto) {
			super();
			this.id = id;
			this.producto = producto;
			this.orden = orden;
			this.cantidad = cantidad;
			this.precioProducto = precioProducto;
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


		public Pedido getOrden() {
			return orden;
		}


		public void setOrden(Pedido orden) {
			this.orden = orden;
		}


		public int getCantidad() {
			return cantidad;
		}


		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}


		public BigDecimal getPrecioProducto() {
			return precioProducto;
		}


		public void setPrecioProducto(BigDecimal precioProducto) {
			this.precioProducto = precioProducto;
		}
		
		
		
		
		
		
}
