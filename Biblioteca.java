package br.edu.fatecfranca.ads.ex1;
 
import java.util.ArrayList;

public class Biblioteca {
    private double valor;
    private int qtde;
    private ArrayList<Produto> produtos;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Biblioteca(double valor, int qtde, ArrayList<Produto> produtos) {
        this.valor = valor;
        this.qtde = qtde;
        this.produtos = produtos;
    }

    public Biblioteca () {
        this.produtos = new ArrayList();
    }

    @Override
    public String toString() {
        return "Biblioteca: "
                + "\n valor: " + valor 
                + "\n qtde: " + qtde 
                + "\n produtos: " + produtos 
                + '}';
    }
    
     
    public void addProduto(Produto camaleao) {
        this.produtos.add(camaleao);
    
}
    
}
