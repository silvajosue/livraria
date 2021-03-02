package com.silva.trainingoauth.treinamentooauth.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Editora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5972902574626757502L;


	private Long id;

	private String nome;

}
