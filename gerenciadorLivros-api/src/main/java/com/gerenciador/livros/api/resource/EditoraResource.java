package com.gerenciador.livros.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciador.livros.api.model.Editora;
import com.gerenciador.livros.api.repository.EditoraRepository;

@RestController
@RequestMapping("/editoras")
public class EditoraResource {
	
	@Autowired
	private EditoraRepository editoraRepository;
	
	@GetMapping
	public List<Editora> listar() {
		return editoraRepository.findAll();
	}

}
