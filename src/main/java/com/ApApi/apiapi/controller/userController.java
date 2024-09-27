package com.ApApi.apiapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApApi.apiapi.model.usuarioModel;
import com.ApApi.apiapi.repository.userRepository;

@RestController
@RequestMapping("user")
public class userController {
	
	@Autowired
	userRepository repository;
	
	
	@GetMapping
	public List<usuarioModel> listarUsuarios(){
		List<usuarioModel> lista = repository.findAll();
		return lista;
	}
	
	@PostMapping
	public void salvarUsuario(@RequestBody UsuarioDTO dados) {
		usuarioModel userdata = new usuarioModel(dados);
		repository.save(userdata);
	}
}
