package com.silva.trainingusuario.treinamentousuario.model.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AutorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8781369178945483902L;

	private Long id;

	@NotNull
	private String nome;

	private String creativeCommons;

}
