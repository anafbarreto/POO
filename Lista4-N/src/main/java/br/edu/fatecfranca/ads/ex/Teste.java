package br.edu.fatecfranca.ads.ex;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teste {
   
    public static void calculaSalMostra(Funcionario camaleao) {
        camaleao.calculaSal();
        System.out.println(camaleao.toString());
    }
    
    public static void main(String[] args) {

         Gerente gerente1 = (new Gerente(5000,"ana",25,40));
         Diretor diretor1 = (new Diretor(8000,"Amarok","Junior", 40, 70));
         calculaSalMostra(gerente1);
         calculaSalMostra(diretor1);


        Departamento depto1 = new Departamento("CSC", "Administrativo", new ArrayList());
        depto1.addFuncionario(diretor1);
        depto1.addFuncionario(gerente1);

        JOptionPane.showMessageDialog(null, depto1.toString());
    }

}
