package org.example;

public class Medidor {

    ITemperatura temperatura;
    TemperaturaAdapter adaptador;

    public Medidor() {
        temperatura = new TemperaturaCelsius();
        adaptador = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(String grausCelsius) {
        temperatura.setTemperatura(grausCelsius);
        adaptador.salvarTemperatura();
    }

    public String getTemperatura() {
        return adaptador.recuperarTemperatura();
    }

    public float getFahrenheit() {
        return adaptador.getFahrenheit();
    }
}
