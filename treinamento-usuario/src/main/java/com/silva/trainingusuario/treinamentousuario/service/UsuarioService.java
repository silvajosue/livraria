package com.silva.trainingusuario.treinamentousuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silva.trainingusuario.treinamentousuario.converter.UsuarioConverter;
import com.silva.trainingusuario.treinamentousuario.model.Usuario;
import com.silva.trainingusuario.treinamentousuario.model.dtos.UsuarioDTO;
import com.silva.trainingusuario.treinamentousuario.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository repository;
	
	@Autowired
	private UsuarioConverter converter;

	public UsuarioDTO findById(Long id) {
		Usuario usuario = repository.findById(id).get();
		return converter.toEntityToDto(usuario);
	}

	public UsuarioDTO findByEmail(String email) {
		Usuario usuario = repository.findByEmail(email);
		return converter.toEntityToDto(usuario);
	}
}