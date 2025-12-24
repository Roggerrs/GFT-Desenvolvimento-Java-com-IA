package br.com.exemplo.funcional.supplier;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // Supplier que fornece uma String
        Supplier<String> mensagem = () -> "Olá, Supplier!";

    // Chamado o Supplier
        String resultado = mensagem.get();

        System.out.println(resultado);


    }

}
