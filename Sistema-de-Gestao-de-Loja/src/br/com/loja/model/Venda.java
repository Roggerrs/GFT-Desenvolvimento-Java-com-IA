package br.com.loja.model;

public class Venda {

private Cliente cliente;
private Produto produto;
private int quantidade;
private double valorTotal;

public Venda(Cliente cliente, Produto produto, int quantidade) {
    this.cliente = cliente;
    this.produto = produto;
    this.quantidade = quantidade;
    this.valorTotal = produto.getPreco() * quantidade;

}


public Cliente getCliente() {
    return cliente;
}

public Produto getProduto() {
    return produto;
}

public int getQuantidade() {
   return quantidade;
}

public double getValorTotal() {
    return valorTotal;
}



@Override
public String toString() {
    return "Venda{" +
            "cliente=" + cliente.getNome() +
            ", produto=" + produto.getNome() +
            ", quantidade=" + quantidade +
            ", ValorTotal=" + valorTotal +
            '}';
}
}
