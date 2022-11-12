package com.example.demo.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



import com.example.demo.dto.UsuarioAutenticado;
import com.example.demo.Entidad.Usuario;



@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
     ServicioUsuario usuarioServiceImpl;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioServiceImpl.findOneByEmail(email).get();
        return UsuarioAutenticado.construir(usuario);
    }



}
