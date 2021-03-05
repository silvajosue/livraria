package com.silva.trainingusuario.treinamentousuario.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.silva.trainingusuario.treinamentousuario.model.Usuario;
import com.silva.trainingusuario.treinamentousuario.model.dtos.UsuarioDTO;

@Component
public class UsuarioConverter {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private AutorizacaoConverter autorizacaoConverter;

	public UsuarioDTO toEntityToDto(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setId(usuario.getId());
		dto.setEmail(usuario.getEmail());
		dto.setSenha(usuario.getSenha());
		dto.setNome(usuario.getNome());
		dto.setSobrenome(usuario.getSobrenome());
		dto.setCidade(usuario.getCidade());
		dto.setAut(autorizacaoConverter.toListEntityToDto(usuario.getAut()));
		return dto;
	}

	public Usuario toDtoToEntity(UsuarioDTO usuarioDto) {
		Usuario usuario = new Usuario();
		usuario.setId(usuarioDto.getId());
		usuario.setEmail(usuarioDto.getEmail());
		usuario.setSenha(passwordEncoder.encode(usuarioDto.getSenha()));
		usuario.setNome(usuarioDto.getNome());
		usuario.setSobrenome(usuarioDto.getSobrenome());
		usuario.setCidade(usuarioDto.getCidade());
		usuario.setAut(
				usuarioDto.getAut() != null ? autorizacaoConverter.toListDtoToEntity(usuarioDto.getAut()) : null);
		return usuario;
	}

}
