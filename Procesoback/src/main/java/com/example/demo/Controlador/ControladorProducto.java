package com.example.demo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Producto")
public class ControladorProducto {
	
	@GetMapping("formProducto")
	public String formProducto() {
		return"producto/formProducto";
	}


}
