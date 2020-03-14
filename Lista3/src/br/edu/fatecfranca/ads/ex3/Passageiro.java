package br.edu.fatecfranca.ads.ex3;

public class Passageiro {

    private String RG, nome;

    public Passageiro() {
    }

    public Passageiro(String RG, String nome) {
        this.RG = RG;
        this.nome = nome;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Passageiro "
                + "\n RG: " + RG
                + "\n Nome: " + nome;
    }

}
