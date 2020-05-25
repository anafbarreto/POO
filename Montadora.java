package br.edu.fatecfranca.ads.Prova;

import java.util.ArrayList;

public class Montadora {

    private String nome;
    private String CNPJ;
    private ArrayList<Veiculo> veiculos;

    public Montadora() {
        this.veiculos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public boolean removeVeiculo(Veiculo veiculo) {
        return this.veiculos.remove(veiculo);
    }

    public int getVeiculo(Veiculo veiculo) {
        return this.veiculos.indexOf(nome);

    }

    public boolean updateVeiculo(Veiculo atual, Veiculo novo) {
        int pos = this.getVeiculo(atual);
        if (pos != - 1) {
            this.veiculos.set(pos, novo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Montadora: "
                + "\n nome: " + nome
                + "\n CNPJ=" + CNPJ
                + "\n veiculos=" + veiculos 
                + super.toString() 
                + '}';
    }

}
