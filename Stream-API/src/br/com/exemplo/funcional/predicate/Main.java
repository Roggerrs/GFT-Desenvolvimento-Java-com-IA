package br.com.exemplo.funcional.predicate;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


// Predicate que verifica se um número é maior que 18
        Predicate<Integer> maiorDeIdade = idade -> idade >= 18;

        // Testando o Predicate
        boolean resultado = maiorDeIdade.test(20);


        System.out.println(resultado);

    }
}
