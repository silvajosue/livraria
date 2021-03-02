package com.silva.training.login.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.silva.training.login.model.Usuario;
import com.silva.training.login.model.dtos.UsuarioDTO;

@Component
public class UsuarioConverter {

	public List<UsuarioDTO> toListEntityToDto(List<Usuario> lista) {
		List<UsuarioDTO> dto = new ArrayList<>();
		for (Usuario usuario : lista) {
			UsuarioDTO user = this.toEntityToDto(usuario);
			dto.add(user);
		}
		return dto;
	}

	public UsuarioDTO toEntityToDto(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setId(usuario.getId());
		dto.setEmail(usuario.getEmail());
		dto.setSenha(null);
		return dto;
	}

}
