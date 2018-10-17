package com.gerenciador.livros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.livros.api.model.Editora;

public interface EditoraRepository extends JpaRepository<Editora, Long>{

}
