package com.food.api.notificacao;

import com.food.api.model.Cliente;

public interface Notificacao {

	public void notificar(Cliente cliente, String msg);
}
