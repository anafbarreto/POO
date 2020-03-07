package br.edu.fatecfranca.ads.ex1;

public class Voo {

    private String numero, destino;

//Construtor sem parametro 
    public Voo() {
    }

//Construtor com parametro 
    public Voo(String numero, String destino) {
        this.setNumero(numero);
        this.setDestino(destino);
    }

//setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    // getters
    public String getNumero() {
        return numero;
    }

    public String getDestino() {
        return destino;
    }

// metodos
    public String toString() {
        return "Voo: " + numero
                + "\n Destino: " + destino;
    }

}
