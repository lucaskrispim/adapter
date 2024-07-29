package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedidorTest {

    @Test
    void deveRetornarVelocidadeEmKmH() {
        Medidor medidor = new Medidor();
        medidor.setVelocidade("100");

        assertEquals("100.0", medidor.getVelocidade());
    }

    @Test
    void deveRetornarVelocidadeEmMph() {
        Medidor medidor = new Medidor();
        medidor.setVelocidade("100");

        assertEquals(62.1371f, medidor.getMph(), 0.001f);
    }
}