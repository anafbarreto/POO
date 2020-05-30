package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("55566621", "socorr");
        Passageiro p2 = new Passageiro("0986512", "Maria");
        Passageiro p3 = new Passageiro("22431809", "Manu");
        Passageiro p4 = new Passageiro("987543134", "Pai");
        Passageiro p5 = new Passageiro("09876523", "Mae");
        Passageiro p6 = new Passageiro("98735578", "Kimba");
        
        Onibus o1 = new Onibus();
        Onibus o2 = new Onibus();
        Onibus o3 = new Onibus();
        
        o1.setNumero(1);
        o1.setPlaca("oioioi");
        o2.setNumero(2);
        o2.setPlaca("lalala");
        o1.addPassageiro(p1);
        o1.addPassageiro(p2);
        o2.addPassageiro(p3);
        o2.addPassageiro(p4);
        o3.setNumero(o2.getNumero());
        o3.setPlaca("jjo52");
        o3.addPassageiro(p5);
        o3.addPassageiro(p6);
        
        Rodoviaria rd = new Rodoviaria();
        
        rd.setNome("xuxuzinho");
        rd.setCidade("Dubai");
        
        rd.addOnibus(o1);
        rd.addOnibus(o2);
        
        JOptionPane.showMessageDialog(null, rd.toString());
        
        rd.deleteOnibus(o1);
        
        JOptionPane.showMessageDialog(null, rd.toString());
        
        rd.editOnibus(o2, o3);
        
        JOptionPane.showMessageDialog(null, rd.toString());
    }

}