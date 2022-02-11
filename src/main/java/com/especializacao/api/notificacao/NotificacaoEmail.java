package com.especializacao.api.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.especializacao.api.model.Cliente;

@Profile("Prod")
@TipoDeNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoEmail implements Notificacao {

	public NotificacaoEmail() {

		System.out.println("notificador por email REAL");

	}

	public void notificar(Cliente cliente, String msg) {

		System.out.printf("Cliente %s notificado atrasves do email %s  %s\n", cliente.getNome(), cliente.getEmail(),
				msg);
	}

}