package com.bruno.curso.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.curso.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		//Cliente cliente1 = new Cliente();
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setEmail("Joãodasneves@email.com");
		cliente1.setTelefone("11 11111-1111");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setEmail("mariadasdores@email.com");
		cliente2.setTelefone("22 22222-2222");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
