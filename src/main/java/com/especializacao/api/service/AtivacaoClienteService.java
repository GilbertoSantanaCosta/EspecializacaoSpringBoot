package com.especializacao.api.service;





import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.especializacao.api.model.Cliente;


@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	
	@PostConstruct
	public void init() {
		System.out.println("INIT");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
	
	
	public void ativar(Cliente cliente) {
		cliente.isAtivo();
		
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

		

	}
}
