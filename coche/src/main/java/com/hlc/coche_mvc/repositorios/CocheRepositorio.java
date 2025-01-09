package com.hlc.coche_mvc.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hlc.coche_mvc.entidades.Coche;

@Repository
public interface CocheRepositorio extends CrudRepository<Coche,Integer>{

	Optional<Coche> findById(Long id);

	void deleteById(Long id);

}