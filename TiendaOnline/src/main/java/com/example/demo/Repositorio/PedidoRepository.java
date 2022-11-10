package com.example.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entidad.Pedido;

@Repository

public interface PedidoRepository extends CrudRepository<Pedido,Long>{

}
