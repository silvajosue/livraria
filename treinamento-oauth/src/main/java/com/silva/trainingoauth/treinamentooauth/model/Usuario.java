package com.silva.trainingoauth.treinamentooauth.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8613173488691302657L;

	private Long id;

	private String email;

	private String senha;

	private String nome;

	private String sobrenome;

	private String cidade;

	private Set<Autorizacao> aut = new HashSet<>();

	public Usuario(Long id, String email, String senha, String nome, String sobrenome, String cidade) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cidade = cidade;
	}

}
