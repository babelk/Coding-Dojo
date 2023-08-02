package com.codingdojo.dojoninjas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.models.Ninja;
import com.codingdojo.dojoninjas.services.DojoService;
import com.codingdojo.dojoninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojosNinjasController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;

	public DojosNinjasController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}

	@RequestMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo) {
		return "/views/index.jsp";
	}

	@RequestMapping("/ninjas/new")
	public String newNinja(Model model, @Valid @ModelAttribute("ninja") Ninja ninja) {
		List<Ninja> ninjas = ninjaService.allNinjas();
		List<Dojo> dojos = dojoService.allDojos(); // Agregar la lista de dojos disponibles al modelo
		model.addAttribute("ninjas", ninjas);
		model.addAttribute("dojos", dojos); // Agregar la lista de dojos disponibles al modelo
		return "/views/new.jsp";
	}

	@RequestMapping(value = "/dojos/new", method = RequestMethod.POST)
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/index.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}

	@RequestMapping(value = "/ninjas/new", method = RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/new.jsp";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/ninjas/new";

	}

	@RequestMapping("/dojo/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "/views/show.jsp";
	}
}