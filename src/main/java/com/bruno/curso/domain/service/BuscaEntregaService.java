package com.bruno.curso.domain.service;

import org.springframework.stereotype.Service;

import com.bruno.curso.domain.exception.EntidadeNaoEncontradaException;
import com.bruno.curso.domain.model.Entrega;
import com.bruno.curso.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
	
}
