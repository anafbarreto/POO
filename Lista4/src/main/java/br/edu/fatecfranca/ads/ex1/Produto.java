package br.edu.fatecfranca.ads.ex1;

public abstract class Produto {
    
    protected String titulo;
    protected String genero;
    protected String autor;
 
    public Produto () {
    }

    public Produto(String titulo, String genero, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Produto: "
                + "\n nome livro: " + titulo 
                + "\n genero: " + genero 
                + "\n autor: " + autor 
                + '}';
    }

}

