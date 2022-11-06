package com.example.demo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Usuario")
public class ControladorUsuario {
	
		@GetMapping("formUsuario")
		public String formUsuario() {
			return"usuario/formUsuario";
		}

}
