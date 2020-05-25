package br.edu.fatecfranca.ads.Prova;

public class Moto extends Veiculo {

    private String guidao;

    public Moto() {
        super();
    }

    public Moto(String guidao, String modelo, int ano) {
        super(modelo, ano);
        this.guidao = guidao;
    }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    @Override
    public String toString() {
        return "Moto: " 
                + "\n guidao: " + guidao 
                + super.toString() 
                + '}';
    }
    
    

}
