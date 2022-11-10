package com.example.demo.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidad.Carrito;
import com.example.demo.Repositorio.CarritoRepository;


@Service
public class ServicioCarrito {
	
	@Autowired
	CarritoRepository carritoRepository;
	
	public List<Carrito> Listar(){
		return (List<Carrito>)carritoRepository.findAll();
	}
	public Carrito obtenerPorId(Long id) {
		
		return carritoRepository.findById(id).get();
	}
	public void agregar (Carrito carrito) {
		
		carritoRepository.save(carrito);
	}
	
	public void consultar (Carrito carrito) {
		
		carritoRepository.save(carrito);
	}
	
	public void actualizar (Carrito carrito) {
		
		carritoRepository.save(carrito);
		
	}
	
	public void eliminar (Long id) {
		
		carritoRepository.delete(obtenerPorId(id));
	}

}
