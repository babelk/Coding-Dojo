package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerHuman {

    @RequestMapping("")
    public String saludo(@RequestParam(value = "name", required = false) String nombre,
            @RequestParam(value = "lastName", required = false) String apellido) {
        if (nombre == null) {
            return "<h1>Hola Humano!</h1>" + "<br><p>Welcome to SpringBoot!</p>";
        } else if (apellido == null) {
            return "<h1>" + "Hola " + nombre + "!</h1><br><p>Welcome to Springboot!</p>";
        } else {
            return "<h1>" + "Hola " + nombre + " " + apellido + "!</h1><br><p>Welcome to Springboot!</p>";
        }
    }
}
