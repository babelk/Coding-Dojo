package com.codingdojo.springdata.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.springdata.models.Empleado;
import com.codingdojo.springdata.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {
	// Agregando el book al repositorio como una dependencia
	
	@Autowired
	private  EmpleadoRepository empleadoRepository;

	// Devolviendo todos los libros.
	public List<Empleado> empleadosGerente(Long id) {
		return empleadoRepository.findByManagerId(id);
	}
	
	
	public Empleado findEmpleadoPorId(Long id) {
		Optional<Empleado> optionalEmpleado = empleadoRepository.findById(id);
		if (optionalEmpleado.isPresent()) {
			return optionalEmpleado.get();
		} else {
			return null;
		}
	
	}
	public Empleado findManager(Long id) {
		return empleadoRepository.findByIdAndManagerIsNull(id);
		
	
	}
}
