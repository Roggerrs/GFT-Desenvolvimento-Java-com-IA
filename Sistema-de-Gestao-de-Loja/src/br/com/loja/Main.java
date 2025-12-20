package br.com.loja;

import br.com.loja.model.Produto;
import br.com.loja.service.EstoqueService;

public class Main {
    public static void main(String[] args) {

        EstoqueService estoque = new EstoqueService();

        estoque.adicionarProduto(new Produto(1L, "Notebook", 1500, 1));
        estoque.adicionarProduto(new Produto(2L, "Mouse", 25, 5));
        estoque.adicionarProduto(new Produto(3L, "Monitor", 400, 10));

        System.out.println("Produtos no estoque:");
        estoque.listarProdutos();

        System.out.println("Produto mais caro:");
        System.out.println(estoque.produtoMaisCaro());

        System.out.println("Valor total do estoque:");
        System.out.println("R$ " + estoque.valorTotalEstoque());
    }
}
