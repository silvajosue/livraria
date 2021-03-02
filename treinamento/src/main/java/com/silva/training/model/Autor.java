package com.silva.training.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_AUTOR")
@Data
@NoArgsConstructor
public class Autor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1480152828772727124L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_AUTOR")
	private Long id;
	
	@Column(name = "NO_AUTOR")
	private String nome;
	
	@Column(name = "NU_CREATIVE_COMMONS")
	private String creativeCommons;

}
