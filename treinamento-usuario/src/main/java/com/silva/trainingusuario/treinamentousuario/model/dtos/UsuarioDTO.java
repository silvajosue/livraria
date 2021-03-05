package com.silva.trainingusuario.treinamentousuario.model.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

	private Set<AutorizacaoDTO> aut = new HashSet<>();

	public UsuarioDTO(Long id, String email, String senha, String nome, String sobrenome, String cidade) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cidade = cidade;
	}

}
