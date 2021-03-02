package com.silva.trainingusuario.treinamentousuario.converter;

import org.springframework.stereotype.Component;

import com.silva.trainingusuario.treinamentousuario.model.Usuario;
import com.silva.trainingusuario.treinamentousuario.model.dtos.UsuarioDTO;

@Component
public class UsuarioConverter {

	public UsuarioDTO toEntityToDto(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setId(usuario.getId());
		dto.setEmail(usuario.getEmail());
		dto.setSenha(usuario.getSenha());
		return dto;
	}

}
