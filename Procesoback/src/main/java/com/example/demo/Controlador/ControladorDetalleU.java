package com.example.demo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DetalleU")
public class ControladorDetalleU {
	
	@GetMapping("formDetalleU")
	public String formDetalleU() {
		return"DetalleU/formDetalleU";
	}

}
