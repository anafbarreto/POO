package br.edu.fatecfranca.ads.ex1;

public class Livro extends Produto {
    private String ISBN;

    public Livro() {
    super();    
    
    }

    public Livro(String ISBN, String titulo, String genero, String autor) {
        super(titulo, genero, autor);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Livro: " 
                + "\n ISBN: " + ISBN 
                + super.toString() 
                +'}';
    }
    
    
       
}