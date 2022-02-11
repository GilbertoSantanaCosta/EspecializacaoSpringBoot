package com.especializacao.api.notificacao;

import com.especializacao.api.model.Cliente;

public interface Notificacao {

	public void notificar(Cliente cliente, String msg);
}
