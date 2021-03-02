package com.silva.training.login.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silva.training.login.model.dtos.UsuarioDTO;
import com.silva.training.login.service.UsuarioService;


@RefreshScope
@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

private static Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	@Value("${test.config}")
	private String testConfig;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		logger.info("CONFIG = " + testConfig);
		return ResponseEntity.noContent().build();
	}		
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> buscarTodos() {
		return ResponseEntity.ok(service.findAll());
	}	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTO> findById(@PathVariable Long id) {
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		return ResponseEntity.ok(service.buscarUsuarioId(id));
	}
}
