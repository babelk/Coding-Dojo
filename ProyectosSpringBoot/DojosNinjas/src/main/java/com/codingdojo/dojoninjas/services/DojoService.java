package com.codingdojo.dojoninjas.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	// Agregando el licencia al repositorio como una dependencia
	private final DojoRepository dojoRepository;

	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	// Devolviendo todos los licencias.
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}

	// Creando un licencia.
	public Dojo createDojo(Dojo b) {
		return dojoRepository.save(b);
	}
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}

}
