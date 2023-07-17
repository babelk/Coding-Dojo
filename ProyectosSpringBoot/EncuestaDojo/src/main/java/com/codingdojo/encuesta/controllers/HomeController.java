package com.codingdojo.encuesta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}

	@PostMapping("/resultados")
	public String resultado(@RequestParam("name") String name,
			@RequestParam("location") String location,
			@RequestParam("language") String language,
			@RequestParam("comment") String comment,
			HttpSession session) {
	if(!name.isEmpty()) {
        session.setAttribute("name", name);
        session.setAttribute("location", location);
        session.setAttribute("language", language);
        session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	else {
		return "redirect:/createError";
	}
	}
	@RequestMapping("/createError")
	public String error(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "¡Debes completar los campos!");
        return "redirect:/";
	}
}
