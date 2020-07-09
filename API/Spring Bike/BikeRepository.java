package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.entities.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}