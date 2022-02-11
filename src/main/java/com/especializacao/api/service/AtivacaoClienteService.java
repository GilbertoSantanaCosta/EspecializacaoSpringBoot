package com.especializacao.api.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.especializacao.api.model.Cliente;
import com.especializacao.api.notificacao.NivelUrgencia;
import com.especializacao.api.notificacao.Notificacao;
import com.especializacao.api.notificacao.TipoDeNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDeNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificacao notificador;

	public void ativar(Cliente cliente) {
		cliente.isAtivo();

		notificador.notificar(cliente, " Cliente esta ativo");

	}
}
