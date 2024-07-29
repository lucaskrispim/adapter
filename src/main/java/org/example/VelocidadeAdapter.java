package org.example;

public class VelocidadeAdapter extends VelocidadeMph {

    private IVelocidade velocidadeKmH;

    public VelocidadeAdapter(IVelocidade velocidadeKmH) {
        this.velocidadeKmH = velocidadeKmH;
    }

    public String recuperarVelocidade() {
        float kmh = this.convertMphToKmh(this.getMph());
        velocidadeKmH.setVelocidade(Float.toString(kmh));
        return velocidadeKmH.getVelocidade();
    }

    public void salvarVelocidade() {
        float kmh = Float.parseFloat(velocidadeKmH.getVelocidade());
        this.setMph(this.convertKmhToMph(kmh));
    }

    private float convertKmhToMph(float kmh) {
        return kmh / 1.60934f;
    }

    private float convertMphToKmh(float mph) {
        return mph * 1.60934f;
    }
}
