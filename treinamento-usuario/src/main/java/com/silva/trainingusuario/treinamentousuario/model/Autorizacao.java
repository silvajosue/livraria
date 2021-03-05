package com.silva.trainingusuario.treinamentousuario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_AUTORIZACAO")
public class Autorizacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3712234395987218193L;

	@Id
	@Column(name = "CO_AUTORIZACAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NO_AUTORIZACAO")
	private String Autorizacao;
}
