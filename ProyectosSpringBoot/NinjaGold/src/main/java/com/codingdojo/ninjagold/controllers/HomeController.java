package com.codingdojo.ninjagold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	private ArrayList<String[]> mensajes = new ArrayList<>();

	@RequestMapping("/")
	public String gold(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		LocalDateTime miFecha = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("LLLL d YYYY hh:mm a");
		String formattedDate = miFecha.format(format);
		session.setAttribute("fecha", formattedDate);
		session.setAttribute("mensajes", mensajes);
		return "index.jsp";
	}

	@RequestMapping("/moroso")
	public String moroso(HttpSession session) {
		session.setAttribute("count", 0);
		mensajes.clear();
		return "moroso.jsp";
	}

	@PostMapping("reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		mensajes.clear();
		return "redirect:/";
	}

	@PostMapping("random1")
	public String random1(HttpSession session) {
		Random random = new Random();
		int randomNumber = random.nextInt(11) + 10;
		String mensaje = "You entered a Form and earned " + randomNumber + " gold (" + session.getAttribute("fecha")+ ")";
		String[] mensajeConEstilo = {mensaje, "ganar"};
		mensajes.add(mensajeConEstilo);
		Integer count = (Integer) session.getAttribute("count");
		count += randomNumber;
		session.setAttribute("count", count);
		return "redirect:/";
	}

	@PostMapping("random2")
	public String random2(HttpSession session) {
		Random random = new Random();
		int randomNumber = random.nextInt(6) + 5;
		Integer count = (Integer) session.getAttribute("count");
		count += randomNumber;
		session.setAttribute("count", count);
		String mensaje = "You entered a Cave and earned " + randomNumber + " gold (" + session.getAttribute("fecha")+ ")";
		String[] mensajeConEstilo = {mensaje, "ganar"};
		mensajes.add(mensajeConEstilo);

		return "redirect:/";
	}

	@PostMapping("random3")
	public String random3(HttpSession session) {
		Random random = new Random();
		int randomNumber = random.nextInt(4) + 2;
		session.setAttribute("gold", randomNumber);
		Integer count = (Integer) session.getAttribute("count");
		count += randomNumber;
		session.setAttribute("count", count);
		String mensaje = "You entered a House and earned " + randomNumber + " gold (" + session.getAttribute("fecha")+ ")";
		String[] mensajeConEstilo = { mensaje, "ganar" };
		mensajes.add(mensajeConEstilo);
		return "redirect:/";
	}

	@PostMapping("random4")
	public String random4(HttpSession session) {
		Random random = new Random();
		int randomNumber = random.nextInt(51);
		Integer count = (Integer) session.getAttribute("count");
		int sumarRestar = random.nextInt(2);
		if (sumarRestar == 0) {
			session.setAttribute("gold", randomNumber);
			count += randomNumber;
			String mensaje = "You entered a Casino and earned " + randomNumber + " gold (" + session.getAttribute("fecha")
					+ ")";
			String[] mensajeConEstilo = { mensaje, "ganar" };
			mensajes.add(mensajeConEstilo);
		} else {
			count -= randomNumber;
			String mensaje = "You entered a Casino and lost " + Math.abs(randomNumber) + " gold...Ouch ("+ session.getAttribute("fecha") + ")";
			String[] mensajeConEstilo = { mensaje, "perder" };
			mensajes.add(mensajeConEstilo);
		}
		session.setAttribute("count", count);

		if (count < -100) {
			return "redirect:/moroso";
		} else {
			return "redirect:/";
		}
	}

	@PostMapping("random5")
	public String random5(HttpSession session) {
		Random random = new Random();
		int randomNumber = (random.nextInt(46) + 5);
		Integer count = (Integer) session.getAttribute("count");
		count -= randomNumber;
		session.setAttribute("count", count);
		String mensaje = "You entered a Spa and lost " + Math.abs(randomNumber) + " gold (" + session.getAttribute("fecha")+ ")";
		String[] mensajeConEstilo = { mensaje, "perder" };
		mensajes.add(mensajeConEstilo);

		if (count < -100) {
			return "redirect:/moroso";
		} else {
			return "redirect:/";
		}
	}
}
