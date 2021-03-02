package com.silva.training.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_LIVRO")
@Data
@NoArgsConstructor
public class Livro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 218797639303120646L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_LIVRO")
	private Long id;

	@Column(name = "NU_ISBN")
	private String isbn;

	@Column(name = "NO_LIVRO")
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CO_AUTOR")
	private Autor autor;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CO_EDITORA")
	private Editora editora;

}
