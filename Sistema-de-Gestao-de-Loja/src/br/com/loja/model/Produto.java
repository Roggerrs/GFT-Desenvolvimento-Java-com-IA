package br.com.loja.model;

public class Produto {

private Long codigo;
private String nome;
private double preco;
private int quantidade;

    public Produto(Long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getCodigo() {return codigo; }
    public String getNome() {return nome; }
    public double getPreco() {return preco; }
    public int getQuantidade() {return quantidade; }

    @Override
    public String toString() {
        return nome + " | R$" + preco + " | Qtd: " + quantidade;
    }


}

