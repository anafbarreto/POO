package br.edu.fatecfranca.ads.prova.ex3;

public abstract class Computador {
    protected String descricao;

    public Computador(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "descricao: " + descricao + ' ';
    }
    
}
