package br.com.dio.banco;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Roger");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(1000);
        cc.transferir(300, cp);

        cc.imprimirInfosComuns();
        System.out.println();
        cp.imprimirInfosComuns();
    }
}

//Cliente: Roger
//Agência: 1
//Número: 1
//Saldo: 700.0
//
//Cliente: Roger
//Agência: 1
//Número: 2
//Saldo: 300.0


