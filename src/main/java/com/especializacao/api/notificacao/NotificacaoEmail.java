package com.especializacao.api.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.especializacao.api.model.Cliente;

//@Profile("Prod")
@TipoDeNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificacaoEmail implements Notificacao {

	@Autowired
	private NotificacaoProperties properties;
	
	public NotificacaoEmail() {

	}

	@Override
	public void notificar(Cliente cliente, String msg) {

		System.out.println("Host: " + properties.getHost() + " Porta: " + properties.getPort());
		System.out.println("notificador por email REAL");

		System.out.printf("Cliente %s notificado atrasves do email %s  %s\n", cliente.getNome(), cliente.getEmail(),
				msg);
	}

}
