package com.especializacao.api.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.especializacao.api.service.ClienteAtivadoEvent;

@Component
public class EmissaoDeNotaFiscal {

	@EventListener // Atua como um ouvinte sempre notificando sempre que ativação cliente e chamado por meio do ApplicationEventPublisher
	public void envioDeNotaFiscal(ClienteAtivadoEvent event) {
		
		System.out.println("Cliente: " + event.getCliente().getNome() + " Nota fiscal enviada");
	}
	
}
