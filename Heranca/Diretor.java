package br.edu.fatecfranca.ads.ex;

public class Diretor extends Funcionario{
   
    private float bonus;
    private String carro;

    // construtor sem parametro
    public Diretor(){
        super();
    }

    public Diretor(float bonus, String carro, String nome, float horastrab, float valorhr) {
        super(nome, horastrab, valorhr);
        this.bonus = bonus;
        this.carro = carro;
    }

    public float getBonus() {
        return bonus;
    }

    public String getCarro() {
        return carro;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    // anulação método
    @Override
    public String toString() {
        return "Diretor{" + "bonus=" + bonus + ", carro=" + carro + super.toString() +'}';
    }

    // anulação método
    @Override
    public void calculaSal(){
        super.calculaSal();
        this.salario = this.salario + this.bonus;            
    }
    
    
}
