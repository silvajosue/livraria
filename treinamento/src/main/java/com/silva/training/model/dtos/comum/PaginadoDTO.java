package com.silva.training.model.dtos.comum;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaginadoDTO<F> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4675284096232185400L;

	private Integer numPagina;
	private Integer qntPorPagina;
	private F filtro;

}
