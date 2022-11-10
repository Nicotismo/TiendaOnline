package com.example.demo.Entidad;



import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="DetallePedido")


public class DetallePedido {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		//Relacion de clases//
		@ManyToOne(fetch = FetchType.EAGER) //1//
		@JoinColumn(name = "producto:_id") //2//
		private Producto producto;
		
		@ManyToOne(fetch = FetchType.EAGER) //1//
		@JoinColumn(name = "orden:_codigo")
		private Pedido orden;
		
		@Column(name = "cantidad")
		private int cantidad;
		@Column(name = "precioProducto")
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
