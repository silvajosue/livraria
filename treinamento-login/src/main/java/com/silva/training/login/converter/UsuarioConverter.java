package com.silva.training.login.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.silva.training.login.model.Usuario;
import com.silva.training.login.model.dtos.UsuarioDTO;

@Component
public class UsuarioConverter {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
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

	public Usuario toDtoToEntity(UsuarioDTO usuarioDto) {
		Usuario usuario = new Usuario();
		usuario.setId(usuarioDto.getId());
		usuario.setEmail(usuarioDto.getEmail());
		usuario.setSenha(passwordEncoder.encode(usuarioDto.getSenha()));
		return usuario;
	}

}
