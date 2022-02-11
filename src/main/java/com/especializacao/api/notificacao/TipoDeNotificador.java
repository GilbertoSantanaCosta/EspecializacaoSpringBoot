package com.especializacao.api.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME) // Permite que essa anotação seja lida em tepo de execução 
@Qualifier
public @interface TipoDeNotificador {

	NivelUrgencia value();
}
