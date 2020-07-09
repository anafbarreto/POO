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

import br.edu.fatecfranca.repositories.BikeRepository;
import br.edu.fatecfranca.entities.Bike;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/bike")
public class BikeController {

	@Autowired
	BikeRepository injecao;
	
	@GetMapping
	public List<Bike> index() {
		return injecao.findAll();
	}
	
	@PostMapping
	public Bike create(@RequestBody Bike bike) {
		return injecao.save(bike);
	}
	
	@DeleteMapping("/{id}")
	public boolean remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public Bike update(@RequestBody Bike bike) {
		return injecao.save(bike);
	}
}