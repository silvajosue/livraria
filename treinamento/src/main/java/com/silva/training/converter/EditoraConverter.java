package com.silva.training.converter;

import org.springframework.stereotype.Component;

import com.silva.training.model.Editora;
import com.silva.training.model.dtos.EditoraDTO;

@Component
public class EditoraConverter {

	public Editora toDtoToEntity(EditoraDTO editoraDto) {
		Editora editora = new Editora();
		editora.setId(editoraDto.getId());
		editora.setNome(editoraDto.getNome());
		return editora;
	}

	public EditoraDTO toEntityToDto(Editora editora) {
		EditoraDTO dto = new EditoraDTO();
		dto.setId(editora.getId());
		dto.setNome(editora.getNome());
		return dto;
	}

}
