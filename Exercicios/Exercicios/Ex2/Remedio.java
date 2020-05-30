package br.edu.fatecfranca.ads.prova.ex2;

import java.util.Date;

public class Remedio {

    public String nome, marca;
    public Date validade;

    public Remedio() {
    }

    public Remedio(String nome, String marca, Date validade) {
        this.nome = nome;
        this.marca = marca;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Remedio{" + "nome=" + nome + ", marca=" + marca + ", validade=" + validade + '}';
    }

    
    
}
