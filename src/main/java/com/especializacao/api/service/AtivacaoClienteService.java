package com.especializacao.api.service;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.especializacao.api.model.Cliente;
import com.especializacao.api.notificacao.NivelUrgencia;
import com.especializacao.api.notificacao.Notificacao;
import com.especializacao.api.notificacao.TipoDeNotificador;

//@Component
public class AtivacaoClienteService {

	@TipoDeNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificacao notificador;
	
	//@PostConstruct
	public void init() {
		System.out.println("INIT");
	}
	
	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
	public void ativar(Cliente cliente) {
		cliente.isAtivo();

		notificador.notificar(cliente, " Cliente esta ativo");

	}
}
