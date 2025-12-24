package br.com.exemplo.funcional.consumer;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // Consumer que recebe uma String e imprime
        Consumer<String> imprimir = texto -> System.out.println(texto);

        // Executando o Consumer
        imprimir.accept("Olá, Consumer!");



    }


}
