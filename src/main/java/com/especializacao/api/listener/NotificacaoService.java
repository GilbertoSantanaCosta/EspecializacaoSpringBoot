package com.especializacao.api.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.especializacao.api.notificacao.NivelUrgencia;
import com.especializacao.api.notificacao.Notificacao;
import com.especializacao.api.notificacao.TipoDeNotificador;
import com.especializacao.api.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {


	@TipoDeNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificacao notificador;
	
	@EventListener
	public void notificarCliente(ClienteAtivadoEvent event) {
	
		notificador.notificar(event.getCliente(), " Cliente esta ativo");
		
	}
}
