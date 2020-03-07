package br.edu.fatecfranca.ads.ex0;

public class Conta {
    private String numero, agencia, nome; //variaveis com o mesmo tipo "String"
    private float saldo;

public Conta(){ 
        
}    
    
public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    public String toString() {
        return "Numero Conta: " + numero        
        + "\n Agencia: " + agencia 
        + "\n Nome: " + nome 
        + "\n Saldo: " + saldo;
    }
    
    
}
