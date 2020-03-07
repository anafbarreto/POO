package br.edu.fatecfranca.ads.ex1;

import java.util.Date;

public class Reserva {

    private Date data;
    private int id;
    private Passageiro Passageiro;
    private Voo Voo;

//Construtor sem parametro 
    public Reserva() {
    }

//Construtor com parametro 

    public Reserva(Date data, int id, Passageiro Passageiro, Voo Voo) {
        this.data = data;
        this.id = id;
        this.Passageiro = Passageiro;
        this.Voo = Voo;
    }

// setters
    public void setData(Date data) {
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassageiro(Passageiro Passageiro) {
        this.Passageiro = Passageiro;
    }

    public void setVoo(Voo Voo) {
        this.Voo = Voo;
    }

// getters
    public Date getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public Passageiro getPassageiro() {
        return Passageiro;
    }

    public Voo getVoo() {
        return Voo;
    }

// metodos
    public String toString() {
        return "Reserva: "
                + "\n Data: " + data
                + "\n ID: " + id
                + "\n " + Voo.toString()
                + "\n " + Passageiro.toString();
    }

}
