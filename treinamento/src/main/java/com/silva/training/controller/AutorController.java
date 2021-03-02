package com.silva.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.silva.training.model.dtos.AutorDTO;
import com.silva.training.model.dtos.comum.PaginadoDTO;
import com.silva.training.service.AutorService;

import io.swagger.annotations.ApiOperation;

@ApiOperation(value = "Controller responsavel pelos endpoints do autor")
@RestController
@RequestMapping(value = "/autor")
public class AutorController {

	@Autowired
	private AutorService service;

	@ApiOperation(value = "Endpoint responsavel por inserir um autor no banco de dados")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AutorDTO> inserir(@RequestBody AutorDTO autorDto) {
		return ResponseEntity.ok(service.inserir(autorDto));
	}

	@ApiOperation(value = "Endpoint responsavel por alterar od dados de um autor no banco de dados")
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AutorDTO> alterar(@RequestBody AutorDTO autorDto) {
		return ResponseEntity.ok(service.alterar(autorDto));
	}

	@ApiOperation(value = "Endpoint responsavel por remover um autor do banco de dados")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Long> remover(@RequestParam Long id) {
		return ResponseEntity.ok(service.remover(id));
	}

	@ApiOperation(value = "Endpoint responsavel por listar os itens do banco de dados de forma paginada")
	@PostMapping(value = "/listar-paginado", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Page<AutorDTO>> listarPaginado(@RequestBody PaginadoDTO<String> paginadoDto) {
		return ResponseEntity.ok(service.listarPaginado(paginadoDto));
	}

	@ApiOperation(value = "Endpoint responsavel por recuperar item por id")
	@GetMapping(value = "/{id}")
	public ResponseEntity<AutorDTO> buscarEditoraId(@PathVariable Long id) {
		return ResponseEntity.ok(service.buscarAutorId(id));
	}
}
