package com.example.carro;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Vermelho","Ferrari");
        Carro c2 = new Carro("Preto", "BMW");

        System.out.println("Primeiro carro: " + c1);
        System.out.println("Segundo carro: " + c2);

        c1.acelerar();
        c1.acelerar();
        c1.frear();

        System.out.println(c1.getModelo() + "velocidade atual: " + 
        c1.getVelocidade());

        Veiculo v = new Carro("Azul", "Civic");
        v.acelerar();
        System.out.println("Veiculo referenciando Carro - velocidade:" + 
        v.getVelocidade());

    }
}

/* Primeiro carro: Carro{modelo='Ferrari', cor='Vermelho', velocidade=0}
Segundo carro: Carro{modelo='BMW', cor='Preto', velocidade=0}
Ferrari acelarando! Velocidade
Ferrari acelarando! Velocidade
Freando.. Velocidade30
Ferrarivelocidade atual: 30
Civic acelarando! Velocidade
Veiculo referenciando Carro - velocidade:20 */

