package com.silva.trainingusuario.treinamentousuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.silva.trainingusuario.treinamentousuario.model.dtos.UsuarioDTO;
import com.silva.trainingusuario.treinamentousuario.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping(value = "/buscar-email")
	public ResponseEntity<UsuarioDTO> findByEmail(@RequestParam String email) {
		return ResponseEntity.ok(service.findByEmail(email));
	}
}