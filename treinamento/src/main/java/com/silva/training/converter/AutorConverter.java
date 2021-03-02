package com.silva.training.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.silva.training.model.Autor;
import com.silva.training.model.dtos.AutorDTO;

@Component
public class AutorConverter {

	public Autor toDtoToEntity(AutorDTO autorDto) {
		Autor autor = new Autor();
		autor.setId(autorDto.getId());
		autor.setNome(autorDto.getNome());
		autor.setCreativeCommons(autorDto.getCreativeCommons());
		return autor;
	}

	public AutorDTO toEntityToDto(Autor autor) {
		AutorDTO dto = new AutorDTO();
		dto.setId(autor.getId());
		dto.setNome(autor.getNome());
		dto.setCreativeCommons(autor.getCreativeCommons());
		return dto;
	}

	public List<AutorDTO> toListEntityToDto(List<Autor> lista) {
		List<AutorDTO> dto = new ArrayList<>();
		for (Autor autor : lista) {
			AutorDTO autorDto = toEntityToDto(autor);
			dto.add(autorDto);
		}
		return dto;
	}

}
