package com.silva.trainingusuario.treinamentousuario.model;

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
@Table(name = "TB_EDITORA")
@Data
@NoArgsConstructor
public class Editora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5972902574626757502L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_EDITORA")
	private Long id;

	@Column(name = "NO_EDITORA")
	private String nome;

}
