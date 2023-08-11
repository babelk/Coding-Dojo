package com.codingdojo.springdata.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.springdata.models.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long>{
	    
	    List<Empleado> findAll();
	    
	    Empleado findByIdAndManagerIsNull(Long id);
	    
	    List<Empleado> findByManagerId(Long managerId);
	    
	    Optional<Empleado> findById(Long id);
	}

	
	