package com.silva.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silva.training.converter.LivroConverter;
import com.silva.training.model.Livro;
import com.silva.training.model.dtos.LivroDTO;
import com.silva.training.repository.ILivroRepository;

@Service
public class LivroService {

	@Autowired
	private ILivroRepository repository;
	
	@Autowired
	private LivroConverter converter;
	
	public LivroDTO buscarLivroId(Long id) {
		Livro livro = repository.findById(id).get();
		return converter.toEntityToDto(livro);
	}

}
