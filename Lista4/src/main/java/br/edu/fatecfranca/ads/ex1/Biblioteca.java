package br.edu.fatecfranca.ads.ex1;

public class Biblioteca {
    
    // Herança
    protected String nomelivro;
    protected String genero;
 
    
    public Biblioteca() {
    }

    public Biblioteca(String nomelivro, String genero) {
        this.nomelivro = nomelivro;
        this.genero = genero;
    }

    public String getNomelivro() {
        return nomelivro;
    }

      public String getGenero() {
        return genero;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nomelivro=" + nomelivro + ", qtdelivro="  + ", genero=" + genero + '}';
    }

    
    }

    
    
    
    
