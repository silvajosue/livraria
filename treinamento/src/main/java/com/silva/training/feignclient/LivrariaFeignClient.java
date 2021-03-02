package com.silva.training.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.silva.training.model.dtos.AutorDTO;
import com.silva.training.model.dtos.EditoraDTO;
import com.silva.training.model.dtos.LivroDTO;

@Component
@FeignClient(name = "treinamento", path = "/livraria")
public interface LivrariaFeignClient {

	@GetMapping(value = "/livro/{id}")
	ResponseEntity<LivroDTO> buscarLivroId(@PathVariable Long id);
	
	@GetMapping(value = "/editora/{id}")
	ResponseEntity<EditoraDTO> buscarEditoraId(@PathVariable Long id);
	
	@GetMapping(value = "/autor/{id}")
	ResponseEntity<AutorDTO> buscarAutorId(@PathVariable Long id);

}