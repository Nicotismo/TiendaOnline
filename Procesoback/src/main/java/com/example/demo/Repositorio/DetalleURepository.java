package com.example.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entidad.DetalleUsuario;


@Repository

public interface DetalleURepository extends CrudRepository<DetalleUsuario,Long>{

}
