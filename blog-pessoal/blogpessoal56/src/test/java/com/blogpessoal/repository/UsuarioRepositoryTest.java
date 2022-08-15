package com.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.blogpessoal.model.Usuario;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		
		usuarioRepository.deleteAll();
		
		usuarioRepository.save(new Usuario(0L, "Jonathan Rodrigues","https://i.img.btrefk34k.jpg","jonathan@email.com","123455856"));
		usuarioRepository.save(new Usuario(0L, "Jonathan Faria","https://i.img.btrfgh34k.jpg","jonathan2@email.com","123445656"));
		usuarioRepository.save(new Usuario(0L, "Jonathan Rodrigues Sousa","https://i.img.bopoi4k.jpg","jonathan3@email.com","1237852456"));
		usuarioRepository.save(new Usuario(0L, "Rodrigues","https://i.img.btfsfsd34k.jpg","jonatha4n@email.com","12342589656"));
	}
	
	@Test
	@DisplayName("Retorna 1 usuario")
	public void deveRetornarUmUsuario() {
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("jonathan@email.com");
		assertTrue(usuario.get().getUsuario().equals("jonathan@email.com"));
	}
	
	@Test
	@DisplayName("Retorna 3 usuarios")
	public void deveRetornarTresUsuarios() {
		List<Usuario> listaDeUsuario = usuarioRepository.findAllByNomeContainingIgnoreCase("Rodrigues");
		assertEquals(3, listaDeUsuario.size());
		assertTrue(listaDeUsuario.get(0).getNome().equals("Jonathan Rodrigues"));
		assertTrue(listaDeUsuario.get(1).getNome().equals("Jonathan Rodrigues Sousa"));
		assertTrue(listaDeUsuario.get(2).getNome().equals("Rodrigues"));
		
	}
	
	
	
}










