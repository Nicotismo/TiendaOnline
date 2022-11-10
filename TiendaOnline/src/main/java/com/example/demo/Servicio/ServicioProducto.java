package com.example.demo.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidad.Producto;
import com.example.demo.Repositorio.ProductoRepository;



@Service
public class ServicioProducto {
	@Autowired
	ProductoRepository productoRepository;
	
	public List<Producto> Listar(){
		return (List<Producto>)productoRepository.findAll();
	}
	public Producto obtenerPorId(Long id) {
		
		return productoRepository.findById(id).get();
	}
	public void agregar (Producto producto) {
		
		productoRepository.save(producto);
	}
	
	public void consultar (Producto producto) {
		
		productoRepository.save(producto);
	}
	
	public void actualizar (Producto producto) {
		
		productoRepository.save(producto);
		
	}
	
	public void eliminar (Long id) {
		
		productoRepository.delete(obtenerPorId(id));
	}

}
