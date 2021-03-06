package com.silva.trainingoauth.treinamentooauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.silva.trainingoauth.treinamentooauth.model.dtos.UsuarioDTO;

@Component
@FeignClient(name = "treinamento-usuario", path = "/usuario")
public interface UserFeignClient {

	@GetMapping(value = "/buscar-email")
	ResponseEntity<UsuarioDTO> findByEmail(@RequestParam String email);	
}