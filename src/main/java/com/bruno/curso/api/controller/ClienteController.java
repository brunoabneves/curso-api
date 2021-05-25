package com.bruno.curso.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.curso.domain.model.Cliente;
import com.bruno.curso.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClienteController {	
	
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		return clienteRepository.findAll();
	}
}
