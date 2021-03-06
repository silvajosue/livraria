package com.silva.trainingusuario.treinamentousuario.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_USUARIO")
@Data
@NoArgsConstructor
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8613173488691302657L;

	@Id
	@Column(name = "CO_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NO_EMAIL")
	private String email;

	@Column(name = "PS_SENHA")
	private String senha;

	@Column(name = "NO_USUARIO")
	private String nome;

	@Column(name = "NO_SOBRENOME_USUARIO")
	private String sobrenome;

	@Column(name = "NO_CIDADE")
	private String cidade;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "TB_USUARIO_AUTORIZACAO", joinColumns = @JoinColumn(name = "CO_USUARIO"), inverseJoinColumns = @JoinColumn(name = "CO_AUTORIZACAO"))
	private Set<Autorizacao> aut = new HashSet<>();

	public Usuario(Long id, String email, String senha, String nome, String sobrenome, String cidade) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cidade = cidade;
	}

}
