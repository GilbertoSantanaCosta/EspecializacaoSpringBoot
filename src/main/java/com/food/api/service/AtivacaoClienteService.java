package com.food.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.food.api.model.Cliente;
import com.food.api.notificacao.Notificacao;

@Component
public class AtivacaoClienteService {

	@Qualifier("urgente") // Define qual bean sera  usado primeiro 
	@Autowired
	private Notificacao notificador;

	public void ativar(Cliente cliente) {
		cliente.isAtivo();

		notificador.notificar(cliente, " Cliente esta ativo");

	}
}
