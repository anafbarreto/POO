package br.edu.fatecfranca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.edu.fatecfranca.repositories.CidadeRepository;
import br.edu.fatecfranca.entities.Cidade;

@RestController
@CrossOrigin(origins = )
@RequestMapping(apicidade)

public class CidadeController {

	@Autowired
	CidadeRepository injecao;
	
	@GetMapping
	public ListCidade index() {
		return injecao.findAll();
	}
	
	@PostMapping
	public Cidade create(@RequestBody Cidade cidade) {
		return injecao.save(cidade);
	}
	
	@DeleteMapping({id})
	public boolean remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public Cidade update(@RequestBody Cidade cidade) {
		return injecao.save(cidade);
	}
}