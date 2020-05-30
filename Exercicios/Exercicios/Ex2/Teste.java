package br.edu.fatecfranca.ads.prova.ex2;

import java.util.Date; //Utiliza a data atual do sistema
import javax.swing.JOptionPane;

public class Teste {

      public static void main(String[] args) {

        Remedio remedio1;
        remedio1 = new Remedio("Dipirona", "EMS", new Date());
        

        Farmacia farm1 = new Farmacia();
        farm1.setCnpj("47960950000188");
        farm1.setNome("MODERNA");
        farm1.addRemedio(remedio1);

        System.out.println(farm1.toString());

        JOptionPane.showMessageDialog(null, farm1.toString());
    }
}
