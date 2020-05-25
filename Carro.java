package br.edu.fatecfranca.ads.Prova;

public class Carro extends Veiculo {

    private float CapPortMala;

    public Carro() {
        super();
    }

    public Carro(float CapPortMala, String modelo, int ano) {
        super(modelo, ano);
        this.CapPortMala = CapPortMala;
    }

    public float getCapPortMala() {
        return CapPortMala;
    }

    public void setCapPortMala(float CapPortMala) {
        this.CapPortMala = CapPortMala;
    }

    @Override
    public String toString() {
        return "Carro: " 
                + "\n CapPortMala: " + CapPortMala 
                + super.toString () 
                +'}';
    }

    
}
