package com.silva.trainingoauth.treinamentooauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.silva.trainingoauth.treinamentooauth.model.dtos.UsuarioDTO;
import com.silva.trainingoauth.treinamentooauth.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/buscar-email")
	public ResponseEntity<UsuarioDTO> findByEmail(@RequestParam String email) {
		try {
			return ResponseEntity.ok(service.findByEmail(email));
		}
		catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
}
