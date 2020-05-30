package br.edu.fatecfranca.ADS.ex1;

import javax.swing.JOptionPane;

public class Teste {
    public static void main (String[] args){
        Produto obj1 = new Produto(1,"coco", 10, 20);
        obj1.vender(1);
        
        Produto obj2 = new Produto(2, "pilha AA", 4, 40);
        obj2.vender(3);
        
        obj2.subir(10);
        
       
        JOptionPane.showMessageDialog(null, obj1.toString()); // toString mostra todas as informações do objeto 1
        JOptionPane.showMessageDialog(null, obj2.toString()); // toString mostra todas as informações do objeto 2
        
        JOptionPane.showMessageDialog(null, obj2.getqtde()); // aqui o get seleciona e mostra apenas as informações referentes a quantidade
        
      
        
    }
}
