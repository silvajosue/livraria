package com.silva.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.silva.training.model.Livro;

@Repository
public interface ILivroRepository extends JpaRepository<Livro, Long> {

}
