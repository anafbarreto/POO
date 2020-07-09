package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class Rodoviaria {

    private String nome, cidade;
    private ArrayList<Onibus> bus;

    public Rodoviaria() {

        this.bus = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> bus) {
        this.nome = nome;
        this.cidade = cidade;
        this.bus = bus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getBus() {
        return bus;
    }

    public void setBus(ArrayList<Onibus> bus) {
        this.bus = bus;
    }

    public String toString() {
        return "Rodoviaria "
                + "\n Nome: " + nome
                + "\n Cidade: " + cidade
                + "\n Onibus: " + bus;
    }

    public void addOnibus(Onibus onibus) {
        this.bus.add(onibus);
    }

    public boolean deleteOnibus(Onibus onibus) {
        return this.bus.remove(onibus);
    }

    public int findOnibus(Onibus onibus) {
        return this.bus.indexOf(onibus);
    }

    public boolean editOnibus(Onibus atual, Onibus nova) {
        int posicao = this.findOnibus(atual);
        if (posicao != -1) {
            this.bus.set(posicao, nova);
            return true;
        } else {
            return false;
        }
    }
}
