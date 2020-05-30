package br.edu.fatecfranca.ads.prova.ex3;

public class Desktop extends Computador {

    public float tamGab;

    public Desktop(float tamGab, String descricao) {
        super(descricao);
        this.tamGab = tamGab;
    }

        public float getTamGab() {
        return tamGab;
    }

    public void setTamGab(float tamGab) {
        this.tamGab = tamGab;
    }

    @Override
    public String toString() {
        return "Desktop: " +
                "\n tamGab: " + tamGab 
                + super.toString() + ' ';
    }

}
