package com.example.demo.Entidad;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Pedido")

public class Pedido {
		
		private Long codigo;
		private LocalDate fecha;
		private BigDecimal total;
		private Usuario usuario;
		
		
		public Pedido(Long codigo, LocalDate fecha, BigDecimal total, Usuario usuario) {
			super();
			this.codigo = codigo;
			this.fecha = fecha;
			this.total = total;
			this.usuario = usuario;
		}


		public Long getCodigo() {
			return codigo;
		}


		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}


		public LocalDate getFecha() {
			return fecha;
		}


		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}


		public BigDecimal getTotal() {
			return total;
		}


		public void setTotal(BigDecimal total) {
			this.total = total;
		}


		public Usuario getUsuario() {
			return usuario;
		}


		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		
		
}
