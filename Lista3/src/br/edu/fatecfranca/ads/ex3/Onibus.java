package br.edu.fatecfranca.ads.ex3;

import br.edu.fatecfranca.ads.ex2.Disciplina;
import java.util.ArrayList;

public class Onibus {

    private int numero;
    private String placa;
    private ArrayList<Passageiro> passageiros;

    public Onibus() {
        passageiros = new ArrayList();
    }

    public Onibus(int numero, String placa, ArrayList<Passageiro> passageiro) {
        this.numero = numero;
        this.placa = placa;
        this.passageiros = passageiros;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPassageiro(ArrayList<Passageiro> passageiro) {
        this.passageiros = passageiro;
    }

    public int getNumero() {
        return numero;
    }

    public String getPlaca() {
        return placa;
    }

    public ArrayList<Passageiro> getPassageiro() {
        return passageiros;
    }

    public String toString() {
        return "Onibus"
                + "\n Numero: " + numero
                + "n Placa: " + placa
                + "n Passageiro: " + passageiros;
    }

    // CRUD
    public void addPassageiro(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }

    public boolean removePassageiro(Passageiro passageiro) {
        return this.passageiros.remove(passageiro);
    }

    public int getPassageiro(Passageiro passageiro) {
        return this.passageiros.indexOf(passageiro);
    }

    public boolean updatePassageiro(Passageiro atual, Passageiro nova) {
        int posicao = this.getPassageiro(atual);
        if (posicao != -1) {
            this.passageiros.set(posicao, nova);
            return true;
        } else {
            return false;
        }

    }
}
