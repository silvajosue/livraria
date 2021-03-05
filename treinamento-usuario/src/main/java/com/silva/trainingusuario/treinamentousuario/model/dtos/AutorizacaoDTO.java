package com.silva.trainingusuario.treinamentousuario.model.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorizacaoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1190966675747099000L;

	private Long id;

	private String Autorizacao;
}
