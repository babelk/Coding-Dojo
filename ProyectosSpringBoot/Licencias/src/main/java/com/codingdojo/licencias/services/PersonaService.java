package com.codingdojo.licencias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.licencias.models.Persona;
import com.codingdojo.licencias.repositories.PersonaRepository;

@Service
public class PersonaService {
	// Agregando el persona al repositorio como una dependencia
	private final PersonaRepository personaRepository;
	
	@Autowired
	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	// Devolviendo todos los personas.
	public List<Persona> allPersonas() {
		return personaRepository.findAll();
	}
	public Optional<Persona> encontrarPersonaPorId(Long id) {
		return personaRepository.findById(id);
	}

	// Creando un persona.
	public Persona createPersona(Persona b) {
		return personaRepository.save(b);
	}
	
	public List<Persona> obetenerPersonaSinLicencia() {
		return personaRepository.findByLicenciaIsNull();
	}

}
