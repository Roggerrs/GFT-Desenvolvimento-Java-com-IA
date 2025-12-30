package br.com.exemplo.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio06MaiorQueDez {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,11,9,5,4,3);

        boolean existe = numeros.stream()
                .anyMatch(n -> n > 10);

        System.out.println(existe);

    }

}
// Resultado: falso