package br.edu.fatecfranca.ads.ex2;

//variaveis
public class Disciplina {

    private int id;
    private String nome;

//construtor sem parametro
    public Disciplina() {
    }

//construtor parametrizado    
    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

// setters    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//getters    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

  
    public String toString() {
        return "Disciplina: " 
                + "\n ID: " + id 
                + "\n Nome: " + nome;
    }

}
