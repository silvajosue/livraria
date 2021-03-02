package com.silva.trainingoauth.treinamentooauth.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Autor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1480152828772727124L;
	
	private Long id;
	
	private String nome;
	
	private String creativeCommons;

}
