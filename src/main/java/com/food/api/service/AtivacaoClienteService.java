package com.food.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.food.api.model.Cliente;
import com.food.api.notificacao.Notificacao;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false) //Deixa a dependencia opcional 
	private Notificacao notificador;

	public void ativar(Cliente cliente) {
		
		if(notificador != null) {
			notificador.notificar(cliente, " Cliente esta ativo");
		}else {
			System.out.println("Não existe notificador mas cliente foi ativado ");
		}
		
		
		
	}
}
