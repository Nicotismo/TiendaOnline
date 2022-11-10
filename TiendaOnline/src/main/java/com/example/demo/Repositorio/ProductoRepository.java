package com.example.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entidad.Producto;

@Repository

public interface ProductoRepository extends CrudRepository<Producto,Long>{

}
