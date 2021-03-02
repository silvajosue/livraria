package com.silva.trainingusuario.treinamentousuario.model.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EditoraDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3553325325758907737L;

	private Long id;

	@NotNull
	private String Nome;

}
