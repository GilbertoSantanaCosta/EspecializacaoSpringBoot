package com.especializacao.api.notificacao;


import org.springframework.stereotype.Component;

import com.especializacao.api.model.Cliente;

//@Profile("dev")
//@TipoDeNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoEmailMock implements Notificacao {

	public NotificacaoEmailMock() {
		System.out.println("notificador por email MOCK");
	}

	public void notificar(Cliente cliente, String msg) {

		System.out.printf("MOCK: (Email Dev) Cliente %s notificado atrasves do email %s  %s\n", cliente.getNome(),
				cliente.getEmail(), msg);
	}

}
