package br.edu.fatecfranca.ads.ex;


public abstract class Funcionario {
    
    protected float salario;
    protected String nome;
    protected float horastrab;
    protected float valorhr;

    public Funcionario() {
    }

    public Funcionario(String nome, float horastrab, float valorhr) {
        this.nome = nome;
        this.horastrab = horastrab;
        this.valorhr = valorhr;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public float getHorastrab() {
        return horastrab;
    }

    public float getValorhr() {
        return valorhr;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorastrab(float horastrab) {
        this.horastrab = horastrab;
    }

    public void setValorhr(float valorhr) {
        this.valorhr = valorhr;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + ", nome=" + nome + ", horastrab=" + horastrab + ", valorhr=" + valorhr + '}';
    }

    public void calculaSal(){
        this.setSalario(this.horastrab * this.valorhr);
    }
}

