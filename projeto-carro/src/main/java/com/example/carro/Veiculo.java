package com.example.carro;

public class Veiculo {
    protected int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade: " + velocidade);
    }

    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) velocidade =0;
        System.out.println("Freando.. Velocidade" + velocidade);

    }

    public int getVelocidade() {
        return velocidade;
    }

}
