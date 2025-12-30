package br.com.exemplo.stream.desafios;

import java.util.Arrays;
import java.util.List;


public class Desafio03TodosPositivos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,-4);

        boolean resultado = numeros.stream()
                .allMatch(n -> n > 0);

        System.out.println(resultado);

    }
}
