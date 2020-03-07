package br.edu.fatecfranca.ads.ex0;

import javax.swing.JOptionPane;

public class Teste {

    public static void main (String[] args) {
    Conta objParte = new Conta();
        objParte.setAgencia("5678");
        objParte.setNome("Pedro");
        objParte.setNumero("123-4");
        objParte.setSaldo(3000);
        
     
    Cartao objTodo = new Cartao();
        objTodo.setBandeira("Corona");
        objTodo.setCvv(666);
        objTodo.setNumero("1111111111111111");
        objTodo.setValidade("10/22");
        objTodo.setSenha("1234");
        
        // associação da "parte" no "todo" para ser um só
        
        objTodo.setConta(objParte);
        
        objTodo.depositar(200);
        objTodo.sacar(150, "1234");
    
            
        JOptionPane.showMessageDialog(null, objTodo.toString());
    }
    
}
   
    
     