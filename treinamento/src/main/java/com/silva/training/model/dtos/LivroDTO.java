package com.silva.training.model.dtos;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LivroDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 218797639303120646L;

	private Long id;

	private String isbn;

	private String nome;

	private AutorDTO autor;

	private EditoraDTO editora;

}
