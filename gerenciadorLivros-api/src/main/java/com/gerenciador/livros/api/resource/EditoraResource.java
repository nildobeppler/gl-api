package com.gerenciador.livros.api.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<Editora> criar(@RequestBody Editora editora, HttpServletResponse response) {
		Editora editoraSalva = editoraRepository.save(editora);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(editoraSalva.getId()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(editoraSalva);
	}
	
	@GetMapping("/{id}")
	public Optional<Editora> buscaPorId(@PathVariable Long id) {
		return editoraRepository.findById(id);
	}

}
