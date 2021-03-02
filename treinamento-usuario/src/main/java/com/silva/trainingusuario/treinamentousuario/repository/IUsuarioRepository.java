package com.silva.trainingusuario.treinamentousuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.trainingusuario.treinamentousuario.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

}
