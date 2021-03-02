package com.silva.training.login.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silva.training.login.converter.UsuarioConverter;
import com.silva.training.login.model.Usuario;
import com.silva.training.login.model.dtos.UsuarioDTO;
import com.silva.training.login.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository repository;
	
	@Autowired
	private UsuarioConverter converter;

	@Transactional
	public List<UsuarioDTO> findAll() {
		List<Usuario> lista = repository.findAll();
		return converter.toListEntityToDto(lista);
	}

	@Transactional
	public UsuarioDTO buscarUsuarioId(Long id) {
		Usuario usuario = repository.findById(id).get();
		return converter.toEntityToDto(usuario);
	}
}
