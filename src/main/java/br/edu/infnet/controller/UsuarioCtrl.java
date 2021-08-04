package br.edu.infnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.modelo.Usuario;

@Controller
public class UsuarioCtrl {

	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(Usuario usuario) {
		
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getNome());
		
		return null;
	}
	
	
}
