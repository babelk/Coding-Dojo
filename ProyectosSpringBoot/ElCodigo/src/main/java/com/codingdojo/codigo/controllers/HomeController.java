package com.codingdojo.codigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @PostMapping("/verify-code")
    public String verifyCode(@RequestParam("code") String code,RedirectAttributes redirectAttributes) {
        // Verificar el código ingresado
        if ("bushido".equals(code)) {
            return "redirect:/code";
        } else {
        	redirectAttributes.addFlashAttribute("error", "You must train Harder!");
        	return "redirect:/";
        }
    }
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
