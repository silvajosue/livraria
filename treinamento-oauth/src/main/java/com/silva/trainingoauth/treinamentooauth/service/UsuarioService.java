package com.silva.trainingoauth.treinamentooauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.silva.trainingoauth.treinamentooauth.converter.UsuarioConverter;
import com.silva.trainingoauth.treinamentooauth.feignclients.UserFeignClient;
import com.silva.trainingoauth.treinamentooauth.model.Usuario;
import com.silva.trainingoauth.treinamentooauth.model.dtos.UsuarioDTO;

@Service
public class UsuarioService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	private UserFeignClient userFeignClient;

	@Autowired
	private UsuarioConverter converter;

	public UsuarioDTO findByEmail(String email) {
		Usuario usuario = userFeignClient.findByEmail(email).getBody();
		if (usuario == null) {
			logger.error("Email not found: " + email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.info("Email found: " + email);
		return converter.toEntityToDto(usuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = userFeignClient.findByEmail(username).getBody();
		if (usuario == null) {
			logger.error("Email not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("Email found: " + username);
		return converter.toEntityToDto(usuario);
	}

}
