package com.example.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entidad.Rol;

@Repository

public interface RolRepository extends CrudRepository<Rol,Long>{

}
