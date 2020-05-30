package br.edu.fatecfranca.ADS.ex2;

//variaveis
public class Rio {
    private String nome;
    public float nivel;
    private boolean poluido; // true (poluido) false (limpo)
    
//construtor sem parametro
public Rio (){
    this.nome = "não definido";
    this.nivel = 0;
    this.poluido = false;
}

//construtor com parametro
public Rio (String nome, float nivel, boolean poluido){
    this.nome = nome;
    this.nivel = nivel;
    this.poluido = poluido;
}

 
public void chover(float x){
    this.nivel += x;
}

public void ensolarar(float x){
    this.nivel -= x;
}

public void sujar(){
    this.poluido = true;
}

public void limpar(){
    this.poluido = false;
}

    public String toString() {
    return "Rio " + this.nome
            + "\n Nivel: " + this.nivel
            + "\n Poluido: " + this.poluido;
          
}

   
}
