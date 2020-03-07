package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente("010756-9","5521-6","Faluno",150);
        obj1.depositar(220);
        obj1.sacar(50);
        
        Cliente obj2 = new Cliente("010578-6","5521-3","Beltrano",500);
        obj2.depositar(100);
        obj2.sacar(200);
              

        JOptionPane.showMessageDialog(null, obj1.toString()); 
        JOptionPane.showMessageDialog(null, obj2.toString()); 

        
        
        //tentando acessar sem o get e o set temos erro por conta do encapsulamento das variaveis, neste caso o Saldo.

    }
}


