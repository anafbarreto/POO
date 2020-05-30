package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;
        
public class Teste {
    
    public static void main(String[] args) {
        String no = JOptionPane.showInputDialog("Informe o nome");
        String id = JOptionPane.showInputDialog("Qual o ID?");
        Integer idad = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        float prov1 = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota 1?"));
        float prov2 = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota 2?"));
        
        
        Aluno obj1 = new Aluno (id,no,idad,prov1,prov2);
        obj1.notaFinal();
        
        Aluno obj2 = new Aluno("012345","antonio",21,7,9);
        obj2.notaFinal();
                          
      
        JOptionPane.showMessageDialog(null, obj1.toString()); 
        JOptionPane.showMessageDialog(null, obj2.toString()); 
        JOptionPane.showMessageDialog(null, ((obj1.aprovacao()) ? "Aprovado" : "Reprovado")); 
        JOptionPane.showMessageDialog(null, ((obj2.aprovacao()) ? "Aprovado" : "Reprovado"));
    
}
    
}
