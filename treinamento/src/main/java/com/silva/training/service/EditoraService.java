package com.silva.training.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silva.training.converter.EditoraConverter;
import com.silva.training.model.Editora;
import com.silva.training.model.dtos.EditoraDTO;
import com.silva.training.repository.IEditoraRepository;

@Service
public class EditoraService {
	
	@Autowired
	private EditoraConverter converter;

	@Autowired
	private IEditoraRepository repository;
	
	
	public EditoraDTO inserir(EditoraDTO editoraDto) {
		Editora editora = converter.toDtoToEntity(editoraDto);
		repository.save(editora);
		return converter.toEntityToDto(editora);
	}

	@Transactional
	public EditoraDTO buscarEditoraId(Long id) {
		Optional<Editora> editora = repository.findById(id);
		return converter.toEntityToDto(editora.get());
	}

}
