package br.edu.fatecfranca.ads.prova.ex3;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Desktop comp1;
        comp1 = new Desktop(32, "positivo r2d2");

        Notebook not1;
        not1 = new Notebook(3000, "Notebook Acer");

        LanHouse lan1 = new LanHouse();
        lan1.addComputador(comp1);
        lan1.addComputador(not1);

        System.out.println(lan1.toString());

        JOptionPane.showMessageDialog(null, lan1.toString());
    }

}
