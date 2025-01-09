package com.hlc.coche_mvc.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hlc.coche_mvc.entidades.coche;

@Repository
public interface CocheRepositorio extends CrudRepository<coche,Integer>{

}