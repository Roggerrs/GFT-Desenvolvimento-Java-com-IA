package br.com.exemplo.stream.desafios;

import java.util.Arrays;
import java.util.List;


public class Desafio02SomaPares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(soma);

    }


}
