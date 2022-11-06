package com.example.demo.Entidad;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.Enum.Estado;


@Entity
@Table (name="Usuario")

public class Usuario {
	
		private long Id;
		private String email;
		private String Password;
		private LocalDate FechaRegistro;
		private DetalleUsuario detalle;
		private Estado estado;
		private Rol rol;
		
		
		public Usuario(long id, String email, String password, LocalDate fechaRegistro, DetalleUsuario detalle,
				Estado estado, Rol rol) {
			super();
			Id = id;
			this.email = email;
			Password = password;
			FechaRegistro = fechaRegistro;
			this.detalle = detalle;
			this.estado = estado;
			this.rol = rol;
		}
		public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public LocalDate getFechaRegistro() {
			return FechaRegistro;
		}
		public void setFechaRegistro(LocalDate fechaRegistro) {
			FechaRegistro = fechaRegistro;
		}
		public DetalleUsuario getDetalle() {
			return detalle;
		}
		public void setDetalle(DetalleUsuario detalle) {
			this.detalle = detalle;
		}
		public Estado getEstado() {
			return estado;
		}
		public void setEstado(Estado estado) {
			this.estado = estado;
		}
		public Rol getRol() {
			return rol;
		}
		public void setRol(Rol rol) {
			this.rol = rol;
		}
		
		
		
	
		
		
	}

