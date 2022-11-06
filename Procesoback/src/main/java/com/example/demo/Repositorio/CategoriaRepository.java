package com.example.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entidad.Categoria;

@Repository

public interface CategoriaRepository extends CrudRepository<Categoria,Long>{

}
