package br.edu.fatecfranca.ads.Prova;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Carro carro1 = new Carro(400, "fiesta", 2014);
        Moto moto1 = new Moto("Guidão esportivo", "XJ6", 2012);

        Montadora mont1 = new Montadora();
        mont1.setCNPJ("47960950000188");
        mont1.setNome("Ford");
        mont1.addVeiculo(moto1);
        mont1.addVeiculo(carro1);

        System.out.println(mont1.toString());

        JOptionPane.showMessageDialog(null, mont1.toString());

    }

}
