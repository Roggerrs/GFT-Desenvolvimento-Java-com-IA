package br.com.loja.service;

import br.com.loja.model.Produto;
import java.util.HashMap;
import java.util.Map;

public class EstoqueService {

private Map<Long, Produto> estoque = new HashMap<>();

public void adicionarProduto(Produto produto) {
    estoque.put(produto.getCodigo(), produto);
}

public void listarProdutos() {
    System.out.println(estoque);
}
public Produto produtoMaisCaro() {
    Produto maisCaro = null;
    double maiorPreco = Double.MIN_VALUE;

    for (Produto p : estoque.values()) {
        if (p.getPreco() > maiorPreco) {
            maiorPreco = p.getPreco();
            maisCaro = p;
        }
    }

    return maisCaro;
}

public double valorTotalEstoque() {
    double total = 0;
    for (Produto p : estoque.values()) {
        total += p.getPreco() * p.getQuantidade();
    }

    return total;
}


}

