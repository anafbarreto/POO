package br.edu.fatecfranca.ads.ex1;

import java.util.Date; //Utiliza a data atual do sistema

/* Para definir uma data, utilizar o codigo:
Calendar c = Calendar.getInstance ();
c.set (Calendar.YEAR, 2018);
c.set (Calendar.MONTH, Calendar.March);
c.set (Calendar.DAY_OF_MONTH, 20);
*/ 

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Voo obj1 = new Voo();
        obj1.setNumero("381");
        obj1.setDestino("Bahia");
        
        Passageiro obj2 = new Passageiro();
        obj2.setNome("Ana");
        obj2.setCpf("123123123-10");
        
        Reserva objTotal = new Reserva(new Date(), 54, obj2, obj1);
        objTotal.setData(new Date()); //(c.getTime ()); -> atribui a data definida no Calendar
        objTotal.setId(2);
        
        (objTotal.getPassageiro()).setCpf("45678912356");
        (objTotal.getPassageiro()).setNome("Carlos");
        (objTotal.getVoo()).setDestino("Paraná");
        (objTotal.getVoo()).setNumero("912356");
        
        
        JOptionPane.showMessageDialog(null, objTotal.toString());
    }

}
