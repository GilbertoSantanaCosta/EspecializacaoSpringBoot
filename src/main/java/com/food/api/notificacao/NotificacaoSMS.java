package com.food.api.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.food.api.model.Cliente;

@Qualifier("urgente")
@Component
public class NotificacaoSMS implements Notificacao {
	
	@Override
	public void notificar(Cliente cliente , String msg) {
	
		System.out.printf("Cliente %s notificado atraves do sms %s usando telefone %s\n", 
				cliente.getNome(), cliente.getTel(), msg);
	}

	
}
