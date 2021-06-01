package com.bruno.curso.domain.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bruno.curso.domain.exception.NegocioException;
import com.bruno.curso.domain.model.Cliente;
import com.bruno.curso.domain.model.Entrega;
import com.bruno.curso.domain.model.StatusEntrega;
import com.bruno.curso.domain.repository.ClienteRepository;
import com.bruno.curso.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {

	private CatalogoClienteService catalogoClienteService;
	private EntregaRepository entregaRepository;
	
	@Transactional
	public Entrega solicitar(Entrega entrega) {
		Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());
		
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(LocalDateTime.now());
		
		return entregaRepository.save(entrega);
	}
	
}
