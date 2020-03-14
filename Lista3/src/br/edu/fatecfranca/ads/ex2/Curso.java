package br.edu.fatecfranca.ads.ex2;

import java.util.ArrayList;

public class Curso {

    private int id;
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Curso() {

// INICIAR ARRAY
        disciplinas = new ArrayList();

    }

// construtor    
    public Curso(int id, String nome, ArrayList<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

// Setters    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

// getters    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String toString() {
        return "Curso{" + "id=" + id + ", nome=" + nome + ", disciplinas=" + disciplinas + '}';
    }

//CRUD
    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public boolean removeDisciplina(Disciplina disciplina) {
        return this.disciplinas.remove(disciplina);
    }

    public int getDisciplina(Disciplina disciplina) {
        return this.disciplinas.indexOf(disciplina);
    }

    public boolean updateDisciplina(Disciplina atual, Disciplina nova) {
        int posicao = this.getDisciplina(atual);
        if (posicao != -1) {
            this.disciplinas.set(posicao, nova);
            return true;
        } else {
            return false;
        }

    }
}
