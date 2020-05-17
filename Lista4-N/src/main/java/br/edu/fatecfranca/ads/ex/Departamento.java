package br.edu.fatecfranca.ads.ex;

import java.util.ArrayList;

public class Departamento {
    private String nome, setor;
    private ArrayList<Funcionario> funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Departamento(String nome, String setor, ArrayList<Funcionario> funcionarios) {
        this.nome = nome;
        this.setor = setor;
        this.funcionarios = funcionarios;
    }

    public Departamento() {
        this.funcionarios = new ArrayList();
    }

    @Override
    public String toString() {
        return "\nDepartamento{" + "nome=" + nome + ", setor=" + setor + ", funcionarios=" + funcionarios + '}';
    }

    public void addFuncionario(Funcionario camaleao) {
        this.funcionarios.add(camaleao);
    }
    
}
