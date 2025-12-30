package br.com.exemplo.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio01Ordenar {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(9,2,8,4,10,5,6,7,3,1);

        numeros.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
