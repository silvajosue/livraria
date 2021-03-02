package com.silva.trainingoauth.treinamentooauth.model;

import java.io.Serializable;

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
}
