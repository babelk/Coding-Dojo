package com.codingdojo.licencias.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.licencias.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
	// Este método recupera todos los libros de la base de datos
	List<Persona> findAll();


    List<Persona> findByLicenciaIsNull();
	
	Optional<Persona> findById(Long id);
}
