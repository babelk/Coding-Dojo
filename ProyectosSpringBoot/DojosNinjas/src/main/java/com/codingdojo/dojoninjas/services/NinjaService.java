package com.codingdojo.dojoninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojoninjas.models.Ninja;
import com.codingdojo.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	// Agregando el persona al repositorio como una dependencia
	private final NinjaRepository ninjaRepository;
	
	@Autowired
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}

	// Devolviendo todos los personas.
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}
	public List<Ninja> findNinjasByDojoId(Long dojoId) {
        return ninjaRepository.findByDojoId(dojoId);
    }

	// Creando un persona.
	public Ninja createNinja(Ninja b) {
		return ninjaRepository.save(b);
	}
	

}
