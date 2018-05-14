package br.com.universo;

public class Humano extends Criatura implements Falante {
    private boolean fala;

    public void setFala(boolean fala) {
        this.fala = fala;
    }

    @Override
    public boolean falar() {
        return fala;
    }

}
