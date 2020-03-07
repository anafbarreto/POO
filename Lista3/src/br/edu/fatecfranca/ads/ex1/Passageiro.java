package br.edu.fatecfranca.ads.ex1;

public class Passageiro {

    private String nome, cpf;

//Construtor sem parametro 
    public Passageiro() {
    }

//Construtor com parametro 
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

// setters 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

// getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

// metodos
    public String toString() {
        return "Passageiro: " + nome
                + "\n CPF: " + cpf;
    }

}
