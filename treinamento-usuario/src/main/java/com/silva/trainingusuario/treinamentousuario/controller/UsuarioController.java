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
	
	@ApiOperation(value = "Endpoint responsavel por criar um novo usuario no banco de dados")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AutorDTO> novoUsuario(@RequestBody UsuarioDTO usuarioDto) {
		//TODO terminar de criar o endpoint
		return ResponseEntity.ok(service.inserir(usuarioDto));
	}
}
