package br.edu.fatecfranca.ads.prova.ex2;

import java.util.ArrayList;

public class Farmacia {

    private String nome;
    private String cnpj;
    private ArrayList<Remedio> remedios;

    public Farmacia(String nome, ArrayList<Remedio> remedios) {
        this.nome = nome;
        this.remedios = remedios;
    }
    
    public Farmacia() {
        this.remedios = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Remedio> getRemedios() {
        return remedios;
    }

    public void setRemedios(ArrayList<Remedio> remedios) {
        this.remedios = remedios;
    }

    
    public void addRemedio(Remedio remedio) {
        this.remedios.add(remedio);
    }

    public boolean removeRemedio(Remedio remedio) {
        return this.remedios.remove(remedio);
    }

    public int getRemedio(Remedio remedio) {
        return this.remedios.indexOf(nome);

    }

    public boolean updateVeiculo(Remedio atual, Remedio novo) {
        int pos = this.getRemedio(atual);
        if (pos != - 1) {
            this.remedios.set(pos, novo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Farmacia{" + "nome=" + nome + ", cnpj=" + cnpj + ", remedios=" + remedios + '}';
    }

}
