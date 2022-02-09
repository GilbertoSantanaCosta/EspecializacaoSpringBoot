package com.food.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.food.api.notificacao.Notificacao;
import com.food.api.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificacao notificacao) {
		return new AtivacaoClienteService(notificacao);
	}
}
