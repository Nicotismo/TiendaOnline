package com.example.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entidad.DetallePedido;

@Repository 

public interface DetallePRepository extends CrudRepository<DetallePedido,Long>{
		
}
