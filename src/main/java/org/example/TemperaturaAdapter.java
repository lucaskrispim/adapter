package org.example;

public class TemperaturaAdapter extends TemperaturaFahrenheit {

    private ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public String recuperarTemperatura() {
        float celsius = this.convertFahrenheitToCelsius(this.getFahrenheit());
        temperaturaCelsius.setTemperatura(Float.toString(celsius));
        return temperaturaCelsius.getTemperatura();
    }

    public void salvarTemperatura() {
        float celsius = Float.parseFloat(temperaturaCelsius.getTemperatura());
        this.setFahrenheit(this.convertCelsiusToFahrenheit(celsius));
    }

    private float convertCelsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    private float convertFahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
