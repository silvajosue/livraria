package com.silva.training.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silva.training.model.Livro;
import com.silva.training.model.dtos.LivroDTO;

@Component
public class LivroConverter {

	@Autowired
	private AutorConverter autorConverter;

	@Autowired
	private EditoraConverter editoraConverter;

	public LivroDTO toEntityToDto(Livro livro) {
		LivroDTO dto = new LivroDTO();
		dto.setId(livro.getId());
		dto.setAutor(autorConverter.toEntityToDto(livro.getAutor()));
		dto.setEditora(editoraConverter.toEntityToDto(livro.getEditora()));
		dto.setIsbn(livro.getIsbn());
		dto.setNome(livro.getNome());
		return dto;
	}

}
