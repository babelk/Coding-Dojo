package com.codingdojo.lenguajes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.lenguajes.models.Lenguaje;

@Repository
public interface LenguajeRepository extends CrudRepository<Lenguaje, Long> {
	// Este método recupera todos los libros de la base de datos
	List<Lenguaje> findAll();

	// Este método encuentra un lenguajes por su nombre
	List<Lenguaje> findByNameContaining(String search);

	// Este método cuenta cuántos lenguajes contiene cierta cadena en el nombre
	Long countByNameContaining(String search);

	// Este método borra un libro que empieza con un nombre específico
	Long deleteByNameStartingWith(String search);

	Optional<Lenguaje> findById(Long id);

}
