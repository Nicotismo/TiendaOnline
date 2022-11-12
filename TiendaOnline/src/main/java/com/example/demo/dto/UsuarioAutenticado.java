package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Entidad.Usuario;

public class UsuarioAutenticado implements UserDetails{
	
	private String email;
	private String contrasena;
	
	private Collection<? extends GrantedAuthority> autoAuthorities;
    public static UsuarioAutenticado construir(Usuario usuario) {
         Collection<GrantedAuthority> authority = new ArrayList<>();
         authority.add(new SimpleGrantedAuthority(usuario.getRol().getNombre()));
        return new UsuarioAutenticado(usuario.getEmail(),usuario.getPassword(),authority);
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return autoAuthorities;
    }
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return contrasena;
	}
	public UsuarioAutenticado(String email, String contrasena, Collection<? extends GrantedAuthority> autoAuthorities) {
		super();
		this.email = email;
		this.contrasena = contrasena;
		this.autoAuthorities = autoAuthorities;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
