package br.com.exemplo.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio05MediaMaiorQueCinco {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        double media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(media);

    }



}
