package com.example.demo.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidad.DetallePedido;
import com.example.demo.Repositorio.DetallePRepository;



@Service
public class ServicioDetallePedido {
	
	@Autowired
	DetallePRepository detallepedidoRepository;
	
	public List<DetallePedido> Listar(){
		return (List<DetallePedido>)detallepedidoRepository.findAll();
	}
	public DetallePedido obtenerPorId(Long id) {
		
		return detallepedidoRepository.findById(id).get();
	}
	public void agregar (DetallePedido detallepedido) {
		
		detallepedidoRepository.save(detallepedido);
	}
	
	public void consultar (DetallePedido detallepedido) {
		
		detallepedidoRepository.save(detallepedido);
	}
	
	public void actualizar (DetallePedido detallepedido) {
		
		detallepedidoRepository.save(detallepedido);
		
	}
	
	public void eliminar (Long id) {
		
		detallepedidoRepository.delete(obtenerPorId(id));
	}
}
