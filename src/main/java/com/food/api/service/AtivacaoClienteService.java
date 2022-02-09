package com.food.api.service;

import org.springframework.stereotype.Component;

import com.food.api.model.Cliente;
import com.food.api.notificacao.Notificacao;
import com.food.api.notificacao.NotificacaoEmail;


public class AtivacaoClienteService {

	private Notificacao notificador;
	
	public AtivacaoClienteService(Notificacao notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivaçãoCliente " + notificador);
	}
	
	public void ativar(Cliente cliente) {
		
		cliente.isAtivo(); 
		
		notificador.notificar(cliente, " Cliente esta ativo");
		
	}
}
