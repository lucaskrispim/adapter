package org.example;

public class VelocidadeKmH implements IVelocidade {

    private String kmh;

    @Override
    public String getVelocidade() {
        return this.kmh;
    }

    @Override
    public void setVelocidade(String kmh) {
        this.kmh = kmh;
    }
}
