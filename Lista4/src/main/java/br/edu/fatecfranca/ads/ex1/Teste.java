package br.edu.fatecfranca.ads.ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teste {
    
       
    public static void main(String[] args) {
        
      Livro livro1 = (new Livro("1234ab","Pinoquio","infatil","sei la"));
      Revista revista1 = (new Revista("284an","Alice","infantil", "Desconhecido"));
      

      Biblioteca bb = new Biblioteca(50, 5, new ArrayList());
        bb.addProduto(livro1);
        bb.addProduto(revista1);

        JOptionPane.showMessageDialog(null, bb.toString());  
        
    }
    
}
