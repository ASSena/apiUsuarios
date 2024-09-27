package com.ApApi.apiapi.model;

import java.util.UUID;

import com.ApApi.apiapi.controller.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="usuario")
public class usuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id; 
	private String nome; 
	private int cpf;
	private int telefone;
	private String email;
	
	public usuarioModel(UsuarioDTO dados) {
		this.id=id;
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
