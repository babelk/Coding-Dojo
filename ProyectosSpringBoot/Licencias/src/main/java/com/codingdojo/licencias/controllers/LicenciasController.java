package com.codingdojo.licencias.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.licencias.models.Licencia;
import com.codingdojo.licencias.models.Persona;
import com.codingdojo.licencias.services.LicenciaService;
import com.codingdojo.licencias.services.PersonaService;

import jakarta.validation.Valid;

@Controller
public class LicenciasController {
	private final LicenciaService licenciaService;
	private final PersonaService personaService;

	public LicenciasController(LicenciaService licenciaService, PersonaService personaService) {
		this.licenciaService = licenciaService;
		this.personaService = personaService;
	}

	@RequestMapping("/persons/new")
	public String newPersons(@Valid @ModelAttribute("persona") Persona persona) {
		return "/licencias/index.jsp";
	}

	@RequestMapping("/licenses/new")
	public String newLicenses(Model model, @Valid @ModelAttribute("licencia") Licencia licencia) {
		List<Persona> personas = personaService.obetenerPersonaSinLicencia();
		model.addAttribute("personas", personas);
		return "/licencias/new.jsp";
	}

	@RequestMapping(value = "/persons/new", method = RequestMethod.POST)
	public String createpersons(@Valid @ModelAttribute("persona") Persona persona, BindingResult result) {
		if (result.hasErrors()) {
			return "/licencias/index.jsp";
		} else {
			personaService.createPersona(persona);
			return "redirect:/persons/new";
		}
	}

	@RequestMapping(value = "/licenses/new", method = RequestMethod.POST)
	public String createlicenses(@Valid @ModelAttribute("licencia") Licencia licencia, BindingResult result) {
		if (result.hasErrors()) {
			return "/licencias/new.jsp";
		} else {
			Integer numLicencias = licenciaService.licenciasCreadas() + 1;
	        Integer NumDeLicencia = numLicencias;

	        // Formateamos el número para obtener la representación con todos los ceros y sin punto decimal
	        String contador = String.format("%06d", NumDeLicencia);

	        licencia.setNumber(contador); // Aquí asignamos el contador formateado a licencia

	        licenciaService.createLicencia(licencia);
	        return "redirect:/licenses/new";
		}
	}
	@RequestMapping("/persons/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Optional<Persona> persona = personaService.encontrarPersonaPorId(id);
		model.addAttribute("persona", persona);
		return "/licencias/show.jsp";
	}

}