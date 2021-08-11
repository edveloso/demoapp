package br.edu.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.modelo.Usuario;
import br.edu.infnet.service.UsuarioService;

@Controller
public class UsuarioCtrl {
	
	
	@Autowired
	private UsuarioService service;
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(Usuario usuario, Model model) {
		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setView(null);
		
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getNome());
		
		service.salvar(usuario);
		
		model.addAttribute("usuario", usuario);
		
		return "lista";
	}
	
	
}
