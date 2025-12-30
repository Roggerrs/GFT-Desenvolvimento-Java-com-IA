package br.com.exemplo.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio11SomaQuadrados {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        int soma = numeros.stream()
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(soma);
    }
}
