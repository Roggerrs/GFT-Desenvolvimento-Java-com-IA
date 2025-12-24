package br.com.exemplo.funcional;

public class main {

public static void main(String[] args) {

    Mensagem msg = () -> System.out.println("Olá, Interface Funcional!");

    msg.enviar();
}
}