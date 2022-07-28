package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//importar biblioteca = ctrl + shift + O;

@RestController
@RequestMapping("/hello")//Diz endereço onde será acessado
public class HelloWorld {
	
	@GetMapping // Coloque a informação abaixo no endereço
	
	public String hello() {
		return "Hello World!";
	}
	
}

