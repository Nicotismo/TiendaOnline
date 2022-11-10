package com.example.demo.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidad.Rol;
import com.example.demo.Repositorio.RolRepository;



@Service
public class ServicioRol {

	
	@Autowired
	RolRepository rolRepository;
	
	public List<Rol> Listar(){
		return (List<Rol>)rolRepository.findAll();
	}
	public Rol obtenerPorId(Long id) {
		
		return rolRepository.findById(id).get();
	}
	public void agregar (Rol rol) {
		
		rolRepository.save(rol);
	}
	
	public void consultar (Rol rol) {
		
		rolRepository.save(rol);
	}
	
	public void actualizar (Rol rol) {
		
		rolRepository.save(rol);
		
	}
	
	public void eliminar (Long id) {
		
		rolRepository.delete(obtenerPorId(id));
	}
}
