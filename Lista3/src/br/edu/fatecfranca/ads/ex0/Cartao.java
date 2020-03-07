package br.edu.fatecfranca.ads.ex0;

public class Cartao {

    private int cvv;
    private String validade, bandeira, numero, senha;
    private Conta conta; //associação com a conta

    //Construtor   
    public Cartao() {

    }

    //set e get
    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //metodos com seleção da classe Conta
    public void depositar(float x) {
        this.conta.setSaldo(this.conta.getSaldo() + x);
    }

    public boolean sacar(float x, String senha) {
        if (this.senha.equals(senha) || this.conta.getSaldo() > x) {
            this.conta.setSaldo(this.conta.getSaldo() - x);
            return true;
        } else {
            return false;
        }

    }

    public String toString() {
        return "Numero Cartao: " + numero
                + "\n Cvv: " + cvv
                + "\n Validade: " + validade
                + "\n Bandeira: " + bandeira
                + "\n " + conta.toString();

// dados do toString da classe conta (funciona mesmo que não incluia o .toString na frente da classe)
    }

}
