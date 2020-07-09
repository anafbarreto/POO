package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="bike")

public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="aro")
	private Integer aro;
	
	@Column(name="quadro")
	private Float quadro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAro() {
		return aro;
	}
	public void setAro(Integer aro) {
		this.aro = aro;
	}
	public Float getQuadro() {
		return quadro;
	}
	public void setQuadro(Float quadro) {
		this.quadro = quadro;
	}
	
}