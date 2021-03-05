package com.silva.trainingoauth.treinamentooauth.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Autorizacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4197771276850688794L;

	private Long id;

	private String Autorizacao;
}
