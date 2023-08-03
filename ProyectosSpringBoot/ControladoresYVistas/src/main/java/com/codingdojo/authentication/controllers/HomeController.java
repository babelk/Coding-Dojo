package com.codingdojo.authentication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	private final UserService userService;

	public HomeController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
		return "/views/registrationPage.jsp";
	}

	@RequestMapping("/login")
	public String login() {
		return "/views/loginPage.jsp";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {

		// si el resultado tiene errores, retornar a la página de registro (no se
		// preocupe por las validaciones por ahora)
		if (result.hasErrors()) {
			return "/views/registrationPage.jsp";

			// si no, guarde el usuario en la base de datos, guarde el id del usuario en el
			// objeto Session y redirija a /home
		} else {
			userService.registerUser(user);
			session.setAttribute("id", user.getId());
			return "redirect:/home";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		// Si el usuario está autenticado, guarde su id de usuario en el objeto Session
		if (userService.authenticateUser(email, password) == true) {
			session.setAttribute("id", userService.findByEmail(email).getId());
			return "redirect:/home";

			// sino agregue un mensaje de error y retorne a la página de inicio de sesión.
		} else {
			model.addAttribute("error", "Credenciales incorrectas. Vualve a intentarlo");
			return "/views/loginPage.jsp";
		}
	}

	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
		// Obtener el usuario desde session, guardarlo en el modelo y retornar a la
		// página principal
		if(session.getAttribute("id") == null) {
			return "redirect:/login";
		}
		else {
			Long userId = (Long) session.getAttribute("id");
			User user = userService.findUserById(userId);
			model.addAttribute("user", user);
			return "/views/homePage.jsp";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// invalidar la sesión
		session.invalidate();
		// redireccionar a la página de inicio de sesión.
		return "redirect:/login";
	}
}
