package com.silva.trainingoauth.treinamentooauth.converter;

import org.springframework.stereotype.Component;

import com.silva.trainingoauth.treinamentooauth.model.Usuario;
import com.silva.trainingoauth.treinamentooauth.model.dtos.UsuarioDTO;

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
