package com.codingdojo.consultasyjoins.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.consultasyjoins.models.Country;
import com.codingdojo.consultasyjoins.services.ApiService;

@Controller
public class HomeController {
	private final ApiService apiService;
	
	public HomeController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@RequestMapping("/1")
	public String sloveno(Model model) {
		List<Object[]> table = apiService.pasisesSloveno();
		model.addAttribute("table", table);
		return "/views/show1.jsp";
	}
	
	@RequestMapping("/2")
	public String ciudades(Model model) {
		List<Object[]> table = apiService.totalCiudades();
		model.addAttribute("table", table);
		return "/views/show2.jsp";
	}
	
	@RequestMapping("/3")
	public String ciudadesMexico(Model model) {
		List<Object[]> table = apiService.ciudadesMexico();
		model.addAttribute("table", table);
		return "/views/show3.jsp";
	}

	@RequestMapping("/4")
	public String idiomasMayorA89(Model model) {
		List<Object[]> table = apiService.idiomasMayorA89();
		model.addAttribute("table", table);
		return "/views/show4.jsp";
	}
	
	@RequestMapping("/5")
	public String areaInferior501(Model model) {
		List<Country> table = apiService.areaInferior501();
		model.addAttribute("table", table);
		return "/views/show5.jsp";
	}
	
	@RequestMapping("/6")
	public String monarquia(Model model) {
		List<Country> table = apiService.monarquia();
		model.addAttribute("table", table);
		return "/views/show6.jsp";
	}
	
	@RequestMapping("/7")
	public String distritoBuenosAires(Model model) {
		List<Object[]> table = apiService.distritoBuenosAires();
		model.addAttribute("table", table);
		return "/views/show7.jsp";
	}	
	
	@RequestMapping("/8")
	public String paisesPorRegion(Model model) {
		List<Object[]> table = apiService.paisesPorRegion();
		model.addAttribute("table", table);
		return "/views/show8.jsp";
	}	
}