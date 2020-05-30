package br.edu.fatecfranca.ads.prova.ex3;

import java.util.ArrayList;

public class LanHouse {

    private ArrayList<Computador> micros;

    public LanHouse() {
        this.micros = new ArrayList();
    }

    public LanHouse(ArrayList<Computador> micros) {
        this.micros = micros;
    }

    public void addComputador(Computador computador) {
        this.micros.add(computador);
    }

    @Override
    public String toString() {
        return "LanHouse: "
                + "\n micros : " + this.micros.toString() + ' ';
    }
}


         // POLIMORFISMO
// o this.micros é polimórfico e junto com o toString() percorre o vetor "micros" e mostra o toString() de acordo com o computador criado
// se for o Notebook, trás as informações da classe Notebook
// se for o Desktop, trás as informações da classe Desktop
// this.micros é polimórfico
               
