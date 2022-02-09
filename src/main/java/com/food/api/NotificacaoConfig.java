package com.food.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.food.api.notificacao.NotificacaoEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificacaoEmail notificacaoEmail() {
		NotificacaoEmail notificar = new NotificacaoEmail("smpt.mail.com.br");
		notificar.setCaixaAlta(true);
		
		return notificar;
	}
}
