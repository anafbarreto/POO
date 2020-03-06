package br.edu.fatecfranca.ads.ex2;

public class Aluno {

    private int id_aluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

// construtor sem parametro
    public Aluno() {
        this.id_aluno = 0;
        this.nome = "Não definido";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;

    }
// construtor com parametro

    public Aluno(String id_aluno, String nome, int idade, float p1, float p2) {
        this.setId_aluno(id_aluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    // setters
    public void setId_aluno(String id_aluno) {
        if (id_aluno.length() == 6) {
            this.id_aluno = Integer.parseInt(id_aluno);
        } else {
            System.out.println("Id inválido");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser igual ou menor que zero");
        }
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("O valor não pode ser igual ou menor que zero");
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("O valor não pode ser igual ou menor que zero");
        }
    }

// getters
    public int id_aluno() {
        return this.id_aluno;
    }

    public String nome() {
        return this.nome;
    }

    public int idade() {
        return this.idade;
    }

    public float p1() {
        return this.p1;
    }

    public float p2() {
        return this.p2;
    }

    //metodos
    public float notaFinal() {
        return ((p1 + p2) / 2);
    }

    public boolean aprovacao() {
        if (this.notaFinal() >= 6) {
            return true;
        } 
        else {
            return false;
        }
    }

    public String toString() {
        return "Aluno: " + this.nome
                + "\n ID: " + this.id_aluno
                + "\n idade: " + this.idade;
    }
}
