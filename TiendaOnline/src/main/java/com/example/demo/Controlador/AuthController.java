package com.example.demo.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.Entidad.Usuario;
import com.example.demo.Servicio.ServicioUsuario;



@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    ServicioUsuario  Usuario;
    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        Usuario.agregar(usuario);
        return ResponseEntity.ok(true);
    }
    @PostMapping("/login")
    public String login() {
        return "Estas intentando iniciar Sesion";
    }



}