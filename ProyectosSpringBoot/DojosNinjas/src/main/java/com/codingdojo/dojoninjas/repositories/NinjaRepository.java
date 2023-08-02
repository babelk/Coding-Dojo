package com.codingdojo.dojoninjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojoninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	// Este método recupera todos los libros de la base de datos
	List<Ninja> findAll();
	
	Optional<Ninja> findById(Long id);
	
	List<Ninja> findByDojoId(Long dojoId);
}
