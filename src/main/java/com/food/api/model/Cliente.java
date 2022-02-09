package com.food.api.model;

public class Cliente {

	private String nome;
	private String tel;
	private String email;
	private boolean ativo = false;
	
	public Cliente(String nome, String tel, String email) {
		super();
		this.nome = nome;
		this.tel = tel;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
