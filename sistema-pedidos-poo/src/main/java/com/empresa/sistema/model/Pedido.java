
package com.empresa.sistema.model;


import java.util.ArrayList;
import java.util.List;


public class Pedido {

    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();
    private StatusPedido status = StatusPedido.CRIADO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double getTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
 return total;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}
