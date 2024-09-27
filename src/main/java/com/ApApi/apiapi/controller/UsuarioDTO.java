package com.ApApi.apiapi.controller;

import java.util.UUID;

import com.ApApi.apiapi.model.usuarioModel;

public record UsuarioDTO(UUID id, String nome, int cpf, int telefone, String email) {
	
	public UsuarioDTO(usuarioModel u) {
		this(u.getId(), u.getNome(), u.getCpf(), u.getTelefone(), u.getEmail());
	}

}
