package br.com.exemplo.funcional.binaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        //BinaryOperator que soma dois números
        BinaryOperator<Integer> soma = (a, b) -> a + b;

    // Executando o BinaryOperator
        int resultado = soma.apply(10, 5);

        System.out.println(resultado);

    }
}
