package com.especializacao.api.notificacao;

import org.springframework.stereotype.Component;

import com.especializacao.api.model.Cliente;

@TipoDeNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoSMS implements Notificacao {
	
	@Override
	public void notificar(Cliente cliente , String msg) {
	
		System.out.printf("Cliente %s notificado atraves do sms %s usando telefone %s\n", 
				cliente.getNome(), cliente.getTel(), msg);
	}

	
}
