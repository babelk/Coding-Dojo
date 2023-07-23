package com.codingdojo.lenguajes.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.lenguajes.models.Lenguaje;
import com.codingdojo.lenguajes.repositories.LenguajeRepository;

@Service
public class LenguajeService {
	// Agregando el book al repositorio como una dependencia
	private final LenguajeRepository lenguajeRepository;

	public LenguajeService(LenguajeRepository lenguajeRepository) {
		this.lenguajeRepository = lenguajeRepository;
	}

	// Devolviendo todos los lenguajes.
	public List<Lenguaje> allLenguaje() {
		return lenguajeRepository.findAll();
	}

	// Creando un lenguaje.
	public Lenguaje createLenguaje(Lenguaje b) {
		return lenguajeRepository.save(b);
	}

	// Obteniendo la información de un lenguaje
	public Lenguaje findLenguaje(Long id) {
		Optional<Lenguaje> optionalLenguaje = lenguajeRepository.findById(id);
		if (optionalLenguaje.isPresent()) {
			return optionalLenguaje.get();
		} else {
			return null;
		}
	}

	public void deleteLenguaje(Long id) {
		lenguajeRepository.deleteById(id);
	}
	public Lenguaje updateLenguaje(Lenguaje lenguaje) {
		return lenguajeRepository.save(lenguaje);
	}
}
