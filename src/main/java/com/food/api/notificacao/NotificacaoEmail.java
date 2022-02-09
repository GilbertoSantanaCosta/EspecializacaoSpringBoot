package com.food.api.notificacao;

import org.springframework.stereotype.Component;

import com.food.api.model.Cliente;


public class NotificacaoEmail implements Notificacao {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificacaoEmail( String hostServidorSmtp) {
		
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("notificador por email");
	
	}

	public void notificar(Cliente cliente , String msg) {
		if(this.caixaAlta) {
			msg = msg.toUpperCase();
		}
	
		System.out.printf("Cliente %s notificado atrasves do email %s usando SMTP %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp , msg);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
