package com.example.carro;

import org.junit.Test;
import static org.junit.Assert.*;

public class VeiculoTest {

    @Test
    public void testInicialVelocidadeZero() {
        Veiculo v = new Veiculo();
        assertEquals(0, v.getVelocidade());
    }

    @Test
    public void testAcelerarEFrear() {
        Veiculo v = new Veiculo();
        v.acelerar(); // +10
        assertEquals(10, v.getVelocidade());
        v.frear(); // -10 -> 0
        assertEquals(0, v.getVelocidade());
    }

    @Test
    public void testFrearNaoFicaNegativo() {
        Veiculo v = new Veiculo();
        v.frear(); // ainda 0
        assertEquals(0, v.getVelocidade());
    }
}
