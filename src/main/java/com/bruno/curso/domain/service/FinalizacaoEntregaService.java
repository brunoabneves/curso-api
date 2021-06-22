package com.bruno.curso.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bruno.curso.domain.model.Entrega;
import com.bruno.curso.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {

	private EntregaRepository entregaRepository;
	private BuscaEntregaService buscaentregaService;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaentregaService.buscar(entregaId);
				
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}
	
}
