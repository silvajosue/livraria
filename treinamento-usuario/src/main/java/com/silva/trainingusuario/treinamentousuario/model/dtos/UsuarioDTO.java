package com.silva.trainingusuario.treinamentousuario.model.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
	
	private AutorizacaoDTO autorizacao;
}
