package br.edu.fatecfranca.ads.prova.ex3;

public class Notebook extends Computador {
    public float capBat;

    public Notebook(float capBat, String descricao) {
        super(descricao);
        this.capBat = capBat;
    }

    public float getCapBat() {
        return capBat;
    }

    public void setCapBat(float capBat) {
        this.capBat = capBat;
    }

    @Override
    public String toString() {
        return "Notebook: " + 
                "\n capBat: " + capBat 
                + super.toString() + ' ';
    }
    
}
