package com.silva.training.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.training.model.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long>{

	Page<Autor> findByNomeContainsIgnoreCase(Pageable paginacao, String filtro);

}
