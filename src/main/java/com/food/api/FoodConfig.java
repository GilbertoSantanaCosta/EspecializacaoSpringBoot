package com.food.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.food.api.notificacao.NotificacaoEmail;
import com.food.api.service.AtivacaoClienteService;

//@Configuration
public class FoodConfig {

	@Bean
	public NotificacaoEmail notificacaoEmail() {
		NotificacaoEmail notificar = new NotificacaoEmail("smpt.mail.com.br");
		notificar.setCaixaAlta(true);
		
		return notificar;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificacaoEmail());
	}
}
