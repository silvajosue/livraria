package com.silva.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.silva.training.converter.AutorConverter;
import com.silva.training.model.Autor;
import com.silva.training.model.dtos.AutorDTO;
import com.silva.training.model.dtos.comum.PaginadoDTO;
import com.silva.training.repository.IAutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorConverter converter;

	@Autowired
	private IAutorRepository repository;

	public AutorDTO inserir(AutorDTO autorDto) {
		Autor autor = converter.toDtoToEntity(autorDto);
		repository.save(autor);
		return converter.toEntityToDto(autor);
	}

	public AutorDTO alterar(AutorDTO autorDto) {
		Autor autor = converter.toDtoToEntity(autorDto);
		repository.save(autor);
		return converter.toEntityToDto(autor);
	}

	public Long remover(Long id) {
		repository.deleteById(id);
		return id;
	}

	public Page<AutorDTO> listarPaginado(PaginadoDTO<String> paginadoDto) {
		Pageable paginacao = PageRequest.of(paginadoDto.getNumPagina(), paginadoDto.getQntPorPagina());
		Page<Autor> lista = null;
		if(paginadoDto.getFiltro() == null) { lista = repository.findAll(paginacao); }
		else { lista = repository.findByNomeContainsIgnoreCase(paginacao, paginadoDto.getFiltro());}
		return new PageImpl<AutorDTO>(converter.toListEntityToDto(lista.getContent()), paginacao, lista.getTotalElements());
	}

}
