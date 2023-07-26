package com.codingdojo.licencias.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.licencias.models.Licencia;

//...
@Repository
public interface LicenciaRepository extends CrudRepository<Licencia, Long> {

	List<Licencia> findAll();
	
	Integer countBy();

	Optional<Licencia> findById(Long id);

}
