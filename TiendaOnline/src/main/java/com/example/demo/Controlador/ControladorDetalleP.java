package com.example.demo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DetalleP")
public class ControladorDetalleP {
	
	
	@GetMapping("formDetalleP")
	public String formDetalleP() {
		return"DetalleP/formDetalleP";
	}
}
