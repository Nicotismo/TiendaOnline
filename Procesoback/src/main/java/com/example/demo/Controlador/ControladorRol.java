package com.example.demo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Rol")
public class ControladorRol {
		
	@GetMapping("formRol")
	public String formRol() {
		return"Rol/formRol";
	}
}
