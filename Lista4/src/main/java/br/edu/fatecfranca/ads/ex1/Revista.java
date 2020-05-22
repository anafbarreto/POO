package br.edu.fatecfranca.ads.ex1;

public class Revista extends Produto {
    private String ISSN;

    public Revista() {
    super();    
    
    }

    public Revista(String ISSN, String titulo, String genero, String autor) {
        super(titulo, genero, autor);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    @Override
    public String toString() {
        return "Revista: " 
                + "\n ISSN: " + ISSN 
                + super.toString() 
                +'}';
    }
    
    
       
}
