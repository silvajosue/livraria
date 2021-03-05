package com.silva.trainingoauth.treinamentooauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.silva.trainingoauth.treinamentooauth.feignclients.UserFeignClient;
import com.silva.trainingoauth.treinamentooauth.model.dtos.UsuarioDTO;

@Service
public class UsuarioService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	private UserFeignClient userFeignClient;

	public UsuarioDTO findByEmail(String email) {
		UsuarioDTO usuarioDto = userFeignClient.findByEmail(email).getBody();
		if (usuarioDto == null) {
			logger.error("Email not found: " + email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.info("Email found: " + email);
		return usuarioDto;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioDTO usuarioDto = userFeignClient.findByEmail(username).getBody();
		if (usuarioDto == null) {
			logger.error("Email not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("Email found: " + username);
		return usuarioDto;
	}

}
