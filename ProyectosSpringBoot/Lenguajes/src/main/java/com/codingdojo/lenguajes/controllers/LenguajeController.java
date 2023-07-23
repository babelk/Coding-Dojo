package com.codingdojo.lenguajes.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.lenguajes.models.Lenguaje;
import com.codingdojo.lenguajes.services.LenguajeService;

import jakarta.validation.Valid;

@Controller
public class LenguajeController {
	private final LenguajeService lenguajeService;

	public LenguajeController(LenguajeService lenguajeService) {
		this.lenguajeService = lenguajeService;
	}

	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("lenguaje") Lenguaje lenguaje) {
		List<Lenguaje> lenguajes = lenguajeService.allLenguaje();
		model.addAttribute("lenguajes", lenguajes);
		return "/lenguajes/index.jsp";
	}

//	@RequestMapping("/languages/new")
//	public String newlanguages(@ModelAttribute("lenguaje") Lenguaje lenguaje) {
//		return "redirect:/languages";
//	}

	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Lenguaje> lenguajes = lenguajeService.allLenguaje(); // Utiliza el método correcto aquí
			model.addAttribute("lenguajes", lenguajes);
			return "/lenguajes/index.jsp";
		} else {
			lenguajeService.createLenguaje(lenguaje);
			return "redirect:/languages";
		}
	}

	@RequestMapping("/languages/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Lenguaje lenguaje = lenguajeService.findLenguaje(id);
		model.addAttribute("lenguaje", lenguaje);
		return "/lenguajes/show.jsp";
	}

	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Lenguaje lenguaje = lenguajeService.findLenguaje(id);
		model.addAttribute("lenguaje", lenguaje);
		return "/lenguajes/edit.jsp";
	}

	@RequestMapping(value = "/languages/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje, BindingResult result) {
		if (result.hasErrors()) {
			return "/lenguajes/edit.jsp";
		} else {
			lenguajeService.updateLenguaje(lenguaje);
			return "redirect:/languages";
		}
	}

	@RequestMapping(value = "/languages/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		lenguajeService.deleteLenguaje(id);
		return "redirect:/languages";
	}
}