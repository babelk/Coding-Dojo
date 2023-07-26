package com.codingdojo.licencias.services;

import java.util.List;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.licencias.models.Licencia;
import com.codingdojo.licencias.repositories.LicenciaRepository;

@Service
public class LicenciaService {
	// Agregando el licencia al repositorio como una dependencia
	private final LicenciaRepository licenciaRepository;

	public LicenciaService(LicenciaRepository licenciaRepository) {
		this.licenciaRepository = licenciaRepository;
	}

	// Devolviendo todos los licencias.
	public List<Licencia> allLicencias() {
		return licenciaRepository.findAll();
	}

	public Integer licenciasCreadas() {
		return licenciaRepository.countBy();
	}

	// Creando un licencia.
	public Licencia createLicencia(Licencia b) {
		return licenciaRepository.save(b);
	}

}
