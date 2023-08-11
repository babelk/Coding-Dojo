package com.codingdojo.springdata.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.springdata.models.Empleado;
import com.codingdojo.springdata.services.EmpleadoService;

@Controller
public class HomeController {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping("/gerente/{id}")
	public String gerente(@PathVariable("id") Long id, Model model) {
		Empleado manager = empleadoService.findManager(id);

		if (manager == null) {
			model.addAttribute("error", "El gerente seleccionado no existe.");
			return "jsp/index.jsp";
		} else {
			List<Empleado> empleados = empleadoService.empleadosGerente(manager.getId());
			model.addAttribute("manager", manager);
			model.addAttribute("empleados", empleados);
			return "jsp/index.jsp";

		}
	}
	@GetMapping("/empleado/{id}")
	public String empleado(@PathVariable("id") Long id, Model model) {
		Empleado empleado = empleadoService.findEmpleadoPorId(id);
		if(empleado == null) {
			model.addAttribute("error", "El empleado seleccionado No existe.");
			return "jsp/empleado.jsp";
		}
		model.addAttribute("empleado", empleado);
		Empleado manager = empleado.getManager();
		if(manager == null) {
			model.addAttribute("error", "El empleado seleccionado es manager.");
			return "jsp/empleado.jsp";
		}
		else {
			model.addAttribute("manager", manager);
			return "jsp/empleado.jsp";
		}
	}
}
