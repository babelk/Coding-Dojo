package com.example.demo.controllers;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
    @RequestMapping("/")
    public String home(Model model) {
        return "home.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model) {
    	LocalDateTime miFecha = LocalDateTime.now();
    	DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, 'del' dd 'de' LLLL, YYYY");
    	String formattedDate = miFecha.format(format);
    	model.addAttribute("fecha", formattedDate);
    	return "date.jsp";
    }
    
    @RequestMapping("/time")
    public String time(Model model) {
    	LocalDateTime mihora = LocalDateTime.now();
    	DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
    	String formattedDate = mihora.format(format);
    	model.addAttribute("hora", formattedDate);
        return "time.jsp";
    }
}