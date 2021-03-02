package com.silva.trainingoauth.treinamentooauth.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Livro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 218797639303120646L;

	private Long id;

	private String isbn;

	private String nome;

	private Autor autor;

	private Editora editora;

}
