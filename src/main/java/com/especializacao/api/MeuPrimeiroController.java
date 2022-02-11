package com.especializacao.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.especializacao.api.model.Cliente;
import com.especializacao.api.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	
	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("meu primeiro controller " + ativacaoClienteService);
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente joao = new Cliente("joao", "98674-9182", "flamacar@hotmail.com");
		
		ativacaoClienteService.ativar(joao);
		
		return "ola2";
	}
}
