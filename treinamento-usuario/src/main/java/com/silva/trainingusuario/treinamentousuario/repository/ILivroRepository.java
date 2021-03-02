package com.silva.trainingusuario.treinamentousuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.trainingusuario.treinamentousuario.model.Livro;

public interface ILivroRepository extends JpaRepository<Livro, Long>{

}
