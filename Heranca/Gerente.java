package br.edu.fatecfranca.ads.ex;

public class Gerente extends Funcionario {
 
    private float comissao;

    public Gerente() {
        super();
    }

    public Gerente(float comissao, String nome, float horastrab, float valorhr) {
        super(nome, horastrab, valorhr);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    // anulação método
    @Override
    public void calculaSal(){
        super.calculaSal();
        this.salario = this.salario + this.comissao;            
    }

    // anulação método
    @Override
    public String toString() {
        return "Gerente{" + "comissao=" + comissao + super.toString() + '}';
    }
        
}
