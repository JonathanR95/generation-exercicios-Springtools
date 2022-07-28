package br.org.generation.helloworld.BSMs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bsm")
public class BSMs {

	@GetMapping
	public String Bsm() {
		return "Mentalidade de Crescimento, Persistência, Responsabilidade Pessoal, Orientação ao Futuro, Comunicação, Orientação aos"
				+ " detalhes, Proatividade, Trabalho em equipe, Gestão de tempo";
	}
}
