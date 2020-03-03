package br.edu.fatecfranca.ads.ex1;

//variaveis
public class Cliente {

    private String numconta;
    private String numagencia;
    private String nome;
    private float saldo;

// construtor sem parametro
    public Cliente() {
        this.numconta = "Não definido";
        this.numagencia = "Não definido";
        this.nome = "Não definido";
        this.saldo = 0;

    }

// construtor parametro
    public Cliente(String numconta, String numagencia, String nome, float saldo) {
        this.setNumconta(numconta);
        this.setNumagencia(numagencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

// setters
    public void setNumconta(String numconta) {
        if ((numconta.length() == 8) && (numconta.charAt(6) == '-')) {
            this.numconta = numconta;
        } else {
            System.out.println("Conta inválida");
        }
    }

    public void setNumagencia(String numagencia) {
        if ((numagencia.length() == 6) && (numagencia.charAt(4) == '-')) {
            this.numagencia = numagencia;
        } else {
            System.out.println("Agência inválida");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O valor não pode ser igual ou menor que zero");
        }
    }

// getters
    public String getNumconta() {
        return this.numconta;
    }

    public String getNumagencia() {
        return this.numagencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

//metodos
    public void depositar(float x) {
        this.saldo = +x;
    }

    public void sacar(float x) {
        this.setSaldo(this.saldo - x);
    }

    public String toString() {
        return "Cliente " + this.nome
                + "\n Conta: " + this.numconta
                + "\n Agência: " + this.numagencia
                + "\n Saldo: " + this.saldo;

    }
}
