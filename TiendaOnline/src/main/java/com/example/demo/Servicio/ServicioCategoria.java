package com.example.demo.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidad.Categoria;
import com.example.demo.Repositorio.CategoriaRepository;


@Service
public class ServicioCategoria {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public List<Categoria> Listar(){
		return (List<Categoria>)categoriaRepository.findAll();
	}
	public Categoria obtenerPorId(Long id) {
		
		return categoriaRepository.findById(id).get();
	}
	public void agregar (Categoria categoria) {
		
		categoriaRepository.save(categoria);
	}
	
	public void consultar (Categoria categoria) {
		
		categoriaRepository.save(categoria);
	}
	
	public void actualizar (Categoria categoria) {
		
		categoriaRepository.save(categoria);
		
	}
	
	public void eliminar (Long id) {
		
		categoriaRepository.delete(obtenerPorId(id));
	}
}
