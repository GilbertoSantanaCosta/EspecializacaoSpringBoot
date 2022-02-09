package com.food.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.food.api.model.Cliente;
import com.food.api.notificacao.Notificacao;

@Component
public class AtivacaoClienteService {

	@Autowired  
	private List<Notificacao> notificadores;

	public void ativar(Cliente cliente) {
		cliente.isAtivo();
		
		for(Notificacao notificador : notificadores) {
			
			notificador.notificar(cliente, " Cliente esta ativo");
		}
		
		
	}
}
