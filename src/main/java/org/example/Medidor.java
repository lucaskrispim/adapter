package org.example;

public class Medidor {

    IVelocidade velocidade;
    VelocidadeAdapter adaptador;

    public Medidor() {
        velocidade = new VelocidadeKmH();
        adaptador = new VelocidadeAdapter(velocidade);
    }

    public void setVelocidade(String kmh) {
        velocidade.setVelocidade(kmh);
        adaptador.salvarVelocidade();
    }

    public String getVelocidade() {
        return adaptador.recuperarVelocidade();
    }

    public float getMph() {
        return adaptador.getMph();
    }
}
