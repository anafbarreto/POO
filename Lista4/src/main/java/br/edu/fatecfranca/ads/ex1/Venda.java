package br.edu.fatecfranca.ads.ex1;

public class Venda extends Biblioteca {
    
    private int qtdestoque;
    private float valor;

    public Venda() {
        super();
    }

    public Venda(int qtdestoque, float valor, String nomelivro, String genero) {
        super(nomelivro, genero);
        this.qtdestoque = qtdestoque;
        this.valor = valor;
    }

    public int getQtdestoque() {
        return qtdestoque;
    }

    public float getValor() {
        return valor;
    }

    public void setQtdestoque(int qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
