package com.example.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entidad.Carrito;

@Repository

public interface CarritoRepository extends CrudRepository<Carrito,Long>{

}
