package br.edu.infnet.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.modelo.Usuario;

@Service
public class UsuarioService {

	public void salvar(Usuario usuario) {
		System.out.println("salvando no banco");
	}

	
	
}
