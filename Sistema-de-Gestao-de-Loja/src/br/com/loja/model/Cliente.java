package br.com.loja.model;

public class Cliente {

private String cpf;
private String nome;

//Contrutor
public Cliente(String cpf, String nome) {
this.cpf = cpf;
this.nome = nome;

}

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }


    @Override
    public String toString() {
    return nome + "(CPF:" + cpf + ")";
    }
}






