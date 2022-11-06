package com.example.demo.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidad.Pedido;
import com.example.demo.Repositorio.PedidoRepository;



@Service
public class ServicioPedido {

	@Autowired
	PedidoRepository pedidoRepository;
	
	public List<Pedido> Listar(){
		return (List<Pedido>)pedidoRepository.findAll();
	}
	public Pedido obtenerPorId(Long codigo) {
		
		return pedidoRepository.findById(codigo).get();
	}
	public void agregar (Pedido pedido) {
		
		pedidoRepository.save(pedido);
	}
	
	public void consultar (Pedido pedido) {
		
		pedidoRepository.save(pedido);
	}
	
	public void actualizar (Pedido pedido) {
		
		pedidoRepository.save(pedido);
		
	}
	
	public void eliminar (Long codigo) {
		
		pedidoRepository.delete(obtenerPorId(codigo));
	}
}
