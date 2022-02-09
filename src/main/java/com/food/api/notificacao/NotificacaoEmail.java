package com.food.api.notificacao;

import org.springframework.stereotype.Component;

import com.food.api.model.Cliente;

@Component
public class NotificacaoEmail implements Notificacao {
	
	private boolean caixaAlta;
	
	
	public NotificacaoEmail( ) {
	
		System.out.println("notificador por email");
	
	}

	public void notificar(Cliente cliente , String msg) {
		if(this.caixaAlta) {
			msg = msg.toUpperCase();
		}
	
		System.out.printf("Cliente %s notificado atrasves do email %s  %s\n", 
				cliente.getNome(), cliente.getEmail(), msg);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
