package com.silva.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silva.training.model.dtos.LivroDTO;
import com.silva.training.service.LivroService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {

	@Autowired
	private LivroService service;

	@ApiOperation(value = "Endpoint responsavel por recuperar item por id")
	@GetMapping(value = "/{id}")
	public ResponseEntity<LivroDTO> buscarLivroId(@PathVariable Long id) {
		return ResponseEntity.ok(service.buscarLivroId(id));
	}

}
