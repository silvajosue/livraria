package com.silva.training.login.model.dtos;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4638409277186402316L;

	private Long id;

	private String email;

	private String senha;
	
	private String nome;
	
	private String sobrenome;
	
	private String cidade;
}
