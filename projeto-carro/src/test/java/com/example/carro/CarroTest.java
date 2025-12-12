package com.example.carro;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarroTest {

    @Test
    public void testCarroAceleraMais() {
        Carro c = new Carro("Vermelho", "TestModel");
        c.acelerar(); // +20 no seu código
        assertEquals(20, c.getVelocidade());
    }

    @Test
    public void testCarroFrearFunciona() {
        Carro c = new Carro("Vermelho", "TestModel");
        c.acelerar(); // 20
        c.frear();    // -10 -> 10
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testToStringContemModeloECor() {
        Carro c = new Carro("Azul", "Civic");
        String s = c.toString();
        assertTrue(s.contains("Civic"));
        assertTrue(s.contains("Azul"));
    }
}
