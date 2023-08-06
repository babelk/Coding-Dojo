package com.codingdojo.listaestudiantes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.listaestudiantes.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	// Este método recupera todos los libros de la base de datos
	
	
	List<Student> findAll();


    List<Student> findByContactIsNull();
	
	Optional<Student> findById(Long id);
}
