package com.especializacao.api.service;
import com.especializacao.api.model.Cliente;


public class ClienteAtivadoEvent {

	
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
