package com.silva.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silva.training.model.dtos.EditoraDTO;
import com.silva.training.service.EditoraService;

import io.swagger.annotations.ApiOperation;

@ApiOperation(value = "Controller responsavel pelos endpoints da editora")
@RequestMapping(value = "/editora")
@RestController
public class EditoraController {

	@Autowired
	private EditoraService service;

	@ApiOperation(value = "Endpoint responsavel por inserir uma nova editora no banco de dados")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EditoraDTO> inserir(@RequestBody EditoraDTO editoraDto) {
		return ResponseEntity.ok(service.inserir(editoraDto));
	}

	@ApiOperation(value = "Endpoint responsavel por recuperar item por id")
	@GetMapping(value = "/{id}")
	public ResponseEntity<EditoraDTO> buscarEditoraId(@PathVariable Long id) {
		return ResponseEntity.ok(service.buscarEditoraId(id));
	}

}
