package br.org.generation.helloworld.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo-aprendizagem")
public class ObjetivosAprendizagem {

	@GetMapping
	public String ObjetivoAprendizagem() {
		return "Banco de Dados-MySQL, DER e MER, Introdução Spring";
	}
	
}
