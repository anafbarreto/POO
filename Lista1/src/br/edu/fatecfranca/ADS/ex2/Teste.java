package br.edu.fatecfranca.ADS.ex2;

import javax.swing.JOptionPane;

public class Teste {
    public static void main (String[] args){
        
        String no = JOptionPane.showInputDialog("Informe o nome?");
        float ni = Float.parseFloat(JOptionPane.showInputDialog("Qual o nível?"));
        int aux = JOptionPane.showConfirmDialog(null, "Poluição do rio",
            "O rio está poluído?", JOptionPane.YES_NO_OPTION);
        boolean pl = (aux == JOptionPane.YES_OPTION);

        Rio obj1 = new Rio(no, ni, pl);
        obj1.chover(10);
        obj1.limpar();

        Rio obj2 = new Rio("oioi", 30, false);
        obj2.ensolarar(5);
        obj2.sujar();

        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    
     
}
}

