package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedidorTest {

    @Test
    void deveRetornarTemperaturaEmCelsius() {
        Medidor medidor = new Medidor();
        medidor.setTemperatura("25");

        assertEquals("25.0", medidor.getTemperatura());
    }

    @Test
    void deveRetornarTemperaturaEmFahrenheit() {
        Medidor medidor = new Medidor();
        medidor.setTemperatura("25");

        assertEquals(77.0f, medidor.getFahrenheit());
    }

}