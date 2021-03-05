package com.silva.trainingusuario.treinamentousuario.converter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.silva.trainingusuario.treinamentousuario.model.Autorizacao;
import com.silva.trainingusuario.treinamentousuario.model.dtos.AutorizacaoDTO;

@Component
public class AutorizacaoConverter {

	public Set<AutorizacaoDTO> toListEntityToDto(Set<Autorizacao> autorizacao) {
		Set<AutorizacaoDTO> listDto = new HashSet<>();

		for (Autorizacao autorizacao2 : autorizacao) {
			AutorizacaoDTO dto = toEntityToDto(autorizacao2);
			listDto.add(dto);
		}
		return listDto;
	}

	public Set<Autorizacao> toListDtoToEntity(Set<AutorizacaoDTO> dto) {
		Set<Autorizacao> listAut = new HashSet<>();
		for (AutorizacaoDTO listDto : dto) {
			Autorizacao aut = toDtoToEntity(listDto);
			listAut.add(aut);
		}
		return listAut;
	}

	public AutorizacaoDTO toEntityToDto(Autorizacao autorizacao2) {
		AutorizacaoDTO aut = new AutorizacaoDTO();
		aut.setId(autorizacao2.getId());
		aut.setAutorizacao(autorizacao2.getAutorizacao());
		return aut;
	}

	public Autorizacao toDtoToEntity(AutorizacaoDTO dto) {
		Autorizacao aut = new Autorizacao();
		aut.setId(dto.getId());
		aut.setAutorizacao(dto.getAutorizacao());
		return aut;
	}

}
