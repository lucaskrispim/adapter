package org.example;

public class TemperaturaCelsius implements ITemperatura {

    private String grausCelsius;

    @Override
    public String getTemperatura() {
        return this.grausCelsius;
    }

    @Override
    public void setTemperatura(String grausCelsius) {
        this.grausCelsius = grausCelsius;
    }
}
