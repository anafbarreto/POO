package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class Teste {

    
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina (1,"POO");
        Disciplina d2 = new Disciplina (2,"PW");
        Disciplina d3 = new Disciplina (1,"ED");
        Disciplina d4 = new Disciplina (1,"IHC");
        
        Curso cr = new Curso ();
        cr.setId(10);
        cr.setNome("ADS");
        cr.addDisciplina(d1);
        cr.addDisciplina(d2);
        cr.addDisciplina(d3);
        cr.addDisciplina(d4);
        
        JOptionPane.showMessageDialog(null, cr.toString());
        
        cr.removeDisciplina(d2);
        
        JOptionPane.showMessageDialog(null, cr.toString());
        
        
        
        
        
        
        
        
    }
}
